package com.example.collegecookbbookapp

data class FoodItem(
    val name: String,
    val image: Int,
    val mainIngredients: List<String>,
    val subIngredients: List<String>,
    val optionalIngredients: List<String>,
    val requirements: List<String>,
    val instructions: String
)