package com.example.collegecookbbookapp

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FoodFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FoodListAdapter
    private lateinit var categorySpinner: Spinner
    private lateinit var searchEditText: EditText
    private lateinit var budgetSlider: SeekBar // Add this line
    private lateinit var budgetValueText: TextView // Add this line

    private val categories = listOf("All", "Breakfast", "Lunch", "Dinner", "Snack/Dessert")
    private val foodList = FoodData.foodList

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_food, container, false)
        recyclerView = view.findViewById(R.id.food_recycler_view)
        categorySpinner = view.findViewById(R.id.category_spinner)
        searchEditText = view.findViewById(R.id.search_edit_text)
        budgetSlider = view.findViewById(R.id.budget_slider) // Initialize SeekBar
        budgetValueText = view.findViewById(R.id.budget_value_text) // Initialize TextView
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize category spinner
        val spinnerAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, categories)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        categorySpinner.adapter = spinnerAdapter

        categorySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedCategory = categories[position]
                filter() // Filter the food items
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                filter() // Filter the food items
            }
        }

        // Set up the text change listener for the search EditText
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                filter() // Filter the food items
            }
        })

        // Set up the SeekBar listener
        budgetSlider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                updateBudgetText(progress) // Update the budget text
                filter() // Filter the food items
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // Initialize FoodListAdapter
        adapter = FoodListAdapter(foodList, parentFragmentManager) { foodItem ->
            navigateToFoodDetail(foodItem)
        }
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
    }

    private fun filter() {
        val selectedCategory = categories[categorySpinner.selectedItemPosition]
        val query = searchEditText.text.toString()
        val maxBudget = budgetSlider.progress

        val filteredItems = foodList.filter {
            (selectedCategory == "All" || it.category == selectedCategory) &&
                    (query.isBlank() || it.name.contains(query, ignoreCase = true)) &&
                    it.calculateEstimatedPrice() <= maxBudget
        }

        adapter.updateList(filteredItems)
    }

    private fun updateBudgetText(progress: Int) {
        budgetValueText.text = "$$progress" // Update the TextView with the current progress
    }

    private fun navigateToFoodDetail(foodItem: FoodItem) {
        val bundle = Bundle()
        bundle.putParcelable("foodItem", foodItem)

        val foodDetailFragment = FoodDetailFragment()
        foodDetailFragment.arguments = bundle

        fragmentManager?.beginTransaction()
            ?.replace(R.id.frame_layout, foodDetailFragment)
            ?.addToBackStack(null)
            ?.commit()
    }
}
