package com.example.collegecookbbookapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecipeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FoodListAdapter

    private val foodList = listOf(
        FoodItem(
            "Pancakes",
            R.drawable.explore,
            listOf("Flour", "Milk", "Eggs"),
            listOf("Sugar", "Butter"),
            emptyList(),
            listOf("Pan", "Spatula"),
            "Instructions for making pancakes..."
        ),
        FoodItem(
            "Scrambled Eggs",
            R.drawable.explore,
            listOf("Eggs", "Milk", "Salt", "Pepper"),
            emptyList(),
            emptyList(),
            listOf("Pan", "Spatula"),
            "Instructions for making scrambled eggs..."
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recipe, container, false)
        recyclerView = view.findViewById(R.id.food_recycler_view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Initialize adapter
        adapter = FoodListAdapter(foodList) { foodItem ->
            // Handle food item click
        }
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
    }
}

