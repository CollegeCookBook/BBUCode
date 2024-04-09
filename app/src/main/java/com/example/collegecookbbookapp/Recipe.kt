package com.example.collegecookbbookapp

data class Recipe(
    val name: String,
    val ingredients: List<String>
)

// In your activity or a separate utility class, create a function to generate dummy breakfast recipes
fun generateDummyBreakfastRecipes(): List<Recipe> {
    val recipes = mutableListOf<Recipe>()

    // Add some dummy breakfast recipes
    recipes.add(
        Recipe(
            name = "Scrambled Eggs",
            ingredients = listOf("Eggs", "Salt", "Pepper", "Butter")
        )
    )
    recipes.add(
        Recipe(
            name = "Pancakes",
            ingredients = listOf("Flour", "Milk", "Eggs", "Baking Powder", "Salt", "Sugar")
        )
    )
    recipes.add(
        Recipe(
            name = "Oatmeal",
            ingredients = listOf("Oats", "Water", "Milk", "Salt", "Optional: Berries, Nuts, Honey")
        )
    )

    // Add more dummy recipes as needed

    return recipes
}