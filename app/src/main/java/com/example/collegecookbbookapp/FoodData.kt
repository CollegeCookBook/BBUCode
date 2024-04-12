package com.example.collegecookbbookapp
    object FoodData {
    val foodList = listOf(
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
        ),
        // Add more FoodItem objects as needed
    )
}
