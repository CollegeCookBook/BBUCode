package com.example.collegecookbbookapp

object FoodData {
    val foodList = listOf(
        FoodItem(
            "Pancakes",
            R.drawable.explore,
            "Breakfast",
            listOf("1 cup all-purpose flour", "2 tablespoons sugar", "1 teaspoon baking powder", "1/2 teaspoon baking soda", "1/4 teaspoon salt", "3/4 cup milk", "1 large egg", "2 tablespoons melted butter or vegetable oil"),
            listOf("Optional: chocolate chips, blueberries, or sliced bananas for toppings"),
            listOf("Non-stick skillet or griddle", "Butter or vegetable oil"),
            """
    **Instructions for making pancakes:**

    1. **Prepare Dry Ingredients:**
       - In a large mixing bowl, whisk together the flour, sugar, baking powder, baking soda, and salt.

    2. **Prepare Wet Ingredients:**
       - In a separate bowl, whisk together the milk, egg, and melted butter or vegetable oil.

    3. **Combine Wet and Dry Ingredients:**
       - Pour the wet ingredients into the dry ingredients.
       - Stir until just combined. Be careful not to overmix; a few lumps are okay.

    4. **Preheat Pan or Griddle:**
       - Place a non-stick skillet or griddle over medium heat.
       - If necessary, lightly grease the surface with butter or oil.

    5. **Cook Pancakes:**
       - Pour 1/4 cup of batter onto the skillet or griddle for each pancake.
       - Cook until bubbles form on the surface of the pancakes and the edges look set, about 2-3 minutes.

    6. **Flip and Cook:**
       - Carefully flip the pancakes with a spatula.
       - Cook until golden brown on the other side, about 1-2 minutes.

    7. **Serve:**
       - Transfer the cooked pancakes to a plate.
       - Serve warm with your favorite toppings such as maple syrup, butter, fresh fruits, or whipped cream.

    Enjoy your homemade pancakes! Feel free to customize the recipe by adding chocolate chips, blueberries, or any other ingredients you like.
    """.trimIndent()
        ),
        FoodItem(
            "Scrambled Eggs",
            R.drawable.explore,
            "Breakfast",
            listOf("1 Egg", "A little Milk", "Salt to taste", "Pepper to taste"),
            emptyList(),
            listOf("Pan", "Spatula"),
            "Instructions for making scrambled eggs..."
        ),
        FoodItem(
            "Grilled Chicken",
            R.drawable.explore,
            "Lunch",
            listOf("Chicken Breast", "Olive Oil", "Salt", "Pepper"),
            listOf("Garlic", "Lemon"),
            listOf("Grill", "Tongs"),
            "Instructions for making grilled chicken..."
        ),
        FoodItem(
            "Spaghetti Bolognese",
            R.drawable.explore,
            "Dinner",
            listOf("Spaghetti", "Ground Beef", "Tomato Sauce"),
            listOf("Garlic", "Onion"),
            listOf("Pot", "Spoon"),
            "Instructions for making spaghetti bolognese..."
        ),
        FoodItem(
            "Chocolate Cake",
            R.drawable.explore,
            "Snack/Dessert",
            listOf("Flour", "Sugar", "Cocoa Powder", "Baking Powder"),
            listOf("Milk", "Eggs"),
            listOf("Oven", "Mixing Bowl"),
            "Instructions for making chocolate cake..."
        ),
        FoodItem(
            "3-ingredient Peanut Butter Cookies",
            R.drawable.explore,  // Replace with the actual image resource ID
            "Snack/Dessert",
            listOf("1 cup peanut butter", "1 cup white sugar", "1 large egg"),
            listOf("Optional: chocolate chips, chopped nuts"),
            listOf("Convection Oven", "Electric mixer", "Baking sheet", "Wire rack"),
            """
    **Ingredients:**
    - 1 cup peanut butter
    - 1 cup white sugar
    - 1 large egg

    **Instructions:**

    **Step 1:**
    - Preheat the oven to 350 degrees F (175 degrees C).

    **Step 2:**
    - Mix peanut butter, sugar, and egg together in a bowl using an electric mixer until smooth and creamy.

    **Step 3:**
    - Roll mixture into 1-inch balls and place 1 inch apart on an ungreased baking sheet.

    **Step 4:**
    - Flatten each with a fork, making a criss-cross pattern.

    **Step 5:**
    - Bake in the preheated oven until edges are firm, about 10 minutes. Cool on the baking sheet briefly before removing to a wire rack to cool completely.

    Enjoy your 3-ingredient Peanut Butter Cookies!
    """.trimIndent()
        ),
        // Add more FoodItem objects as needed
    )
}
