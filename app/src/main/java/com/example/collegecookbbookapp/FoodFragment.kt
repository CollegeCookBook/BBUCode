package com.example.collegecookbbookapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FoodFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FoodListAdapter
    private lateinit var categorySpinner: Spinner

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
                (recyclerView.adapter as? FoodListAdapter)?.filterByCategory(selectedCategory)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                (recyclerView.adapter as? FoodListAdapter)?.filterByCategory("All")
            }
        }

        // Initialize FoodListAdapter
        adapter = FoodListAdapter(foodList, parentFragmentManager) { foodItem ->
            navigateToFoodDetail(foodItem)
        }
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
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