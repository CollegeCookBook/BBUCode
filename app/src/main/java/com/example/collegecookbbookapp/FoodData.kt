package com.example.collegecookbbookapp

object FoodData {
    val foodList = listOf(

//BREAKFEST//

//_________________________________________________________________________________________________________________________________________________________//
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
            R.drawable.scrambled_eggs,
            "Breakfast",
            listOf("1 Egg", "A splash of Milk", "Salt to taste", "Pepper to taste", "Butter or Cooking Spray"),
            emptyList(),
            listOf("Pan", "Spatula"),
            """
    **Instructions for making Scrambled Eggs:**

    1. **Preparation:**
       - Crack the egg into a bowl. Add a splash of milk, salt, and pepper to taste.
       - Beat the mixture lightly with a fork until well combined.

    2. **Heat the Pan:**
       - Place a non-stick pan over medium heat.
       - Add a small amount of butter or spray with cooking spray to prevent sticking.

    3. **Cook the Eggs:**
       - Pour the egg mixture into the heated pan.
       - Let it sit for a few seconds until the edges start to set.

    4. **Scramble:**
       - Using a spatula, gently push the cooked portions from the edges towards the center.
       - Continue cooking and gently stirring until the eggs are set but still moist.

    5. **Serve:**
       - Transfer the scrambled eggs to a plate.
       - Enjoy your quick and easy scrambled eggs!

    Tips:
    - For added flavor, you can sprinkle shredded cheese or chopped herbs like chives or parsley on top.
    - Serve with toast or a slice of bread for a complete breakfast.

    This simple and affordable breakfast is perfect for busy college mornings!
    """.trimIndent()
        ),
        FoodItem(
            "Plain Oatmeal",
            R.drawable.oatmeal,
            "Breakfast",
            listOf("1/2 cup rolled oats", "1 cup water or milk", "Pinch of salt"),
            listOf("Optional: Honey or maple syrup", "Optional: Fresh fruits (e.g., bananas, berries)", "Optional: Nuts or seeds (e.g., almonds, chia seeds)", "Optional: Cinnamon or nutmeg"),
            listOf("Saucepan", "Spoon"),
            """
    **Instructions for making Plain Oatmeal:**

    1. **Combine Ingredients:**
       - In a saucepan, combine the rolled oats, water or milk, and a pinch of salt.

    2. **Cook Oatmeal:**
       - Place the saucepan over medium heat.
       - Bring the mixture to a boil, then reduce the heat to low.

    3. **Simmer:**
       - Let the oatmeal simmer for 5-7 minutes, stirring occasionally, until it reaches your desired consistency.

    4. **Serve:**
       - Transfer the oatmeal to a bowl.
       - Customize your oatmeal with optional toppings such as honey, fresh fruits, nuts, seeds, or a sprinkle of cinnamon or nutmeg for extra flavor.

    Tips:
    - For creamier oatmeal, use milk instead of water.
    - Get creative and experiment with different toppings to keep your oatmeal interesting and satisfying.

    This quick and nutritious oatmeal is a perfect breakfast option for busy college students!
    """.trimIndent()
        ),
        FoodItem(
            "Bagel and Cream Cheese",
            R.drawable.bagel_cream_cheese,
            "Breakfast",
            listOf("1 plain bagel", "2-3 tablespoons cream cheese"),
            listOf("Optional: Sliced tomato", "Optional: Sliced red onion", "Optional: Fresh herbs (e.g., chives, dill)"),
            listOf("Toaster", "Butter knife", "Cutting board (for optional toppings)"),
            """
    **Instructions for making Bagel and Cream Cheese:**

    1. **Toast the Bagel:**
       - Place the plain bagel halves in a toaster.
       - Toast until golden brown and crispy.

    2. **Spread Cream Cheese:**
       - Once toasted, remove the bagel halves from the toaster.
       - Using a butter knife, spread 2-3 tablespoons of cream cheese evenly on each bagel half.

    3. **Optional Toppings:**
       - If desired, add sliced tomato, sliced red onion, or fresh herbs (e.g., chives, dill) on top of the cream cheese.

    4. **Serve:**
       - Place the bagel halves together to form a sandwich, or serve open-faced.
       - Enjoy your simple and satisfying bagel and cream cheese!

    Tips:
    - For extra flavor, you can use flavored cream cheese varieties like chive and onion, garlic and herb, or strawberry.
    - Customize your bagel sandwich by adding your favorite toppings or spreads, such as avocado, smoked salmon, or bacon.

    This quick and tasty bagel and cream cheese is a perfect breakfast or snack option for busy college students!
    """.trimIndent()
        ),
        FoodItem(
            "Rice Cake with Jam",
            R.drawable.rice_cake_jam,
            "Breakfest",
            listOf("1 rice cake", "2-3 tablespoons fruit jam or jelly (e.g., strawberry, raspberry)"),
            listOf("Optional: Peanut butter or almond butter", "Optional: Sliced banana or berries", "Optional: Chia seeds or hemp seeds"),
            listOf("Plate", "Butter knife"),
            """
    **Instructions for making Rice Cake with Jam:**

    1. **Prepare Rice Cake:**
       - Place a rice cake on a plate.

    2. **Spread Jam:**
       - Using a butter knife, spread 2-3 tablespoons of fruit jam or jelly evenly on the rice cake.

    3. **Optional Additions:**
       - If desired, spread a layer of peanut butter or almond butter on the rice cake before adding the jam.
       - Top with sliced banana, berries, or a sprinkle of chia seeds or hemp seeds for added flavor and texture.

    4. **Serve:**
       - Enjoy your simple and tasty rice cake with jam as a quick snack!

    Tips:
    - Experiment with different flavors of jam or jelly to find your favorite combination.
    - Customize your rice cake by adding various toppings like nuts, seeds, or fresh fruits to suit your taste preferences.

    This easy and versatile rice cake with jam is a great snack option for busy college students!
    """.trimIndent()
        ),
        FoodItem(
            "Banana",
            R.drawable.banana,
            "Breakfest",
            listOf("1 ripe banana"),
            listOf("Optional: Peanut butter", "Optional: Chocolate chips", "Optional: Sliced almonds or other nuts"),
            listOf("Plate", "Knife (if adding optional toppings)"),
            """
    **Instructions for enjoying a Banana:**

    1. **Peel the Banana:**
       - Carefully peel the ripe banana and discard the peel.

    2. **Optional Additions:**
       - If desired, spread a layer of peanut butter on the banana for extra flavor and protein.
       - Sprinkle chocolate chips or sliced almonds (or other nuts) over the peanut butter for added texture and taste.

    3. **Serve:**
       - Place the banana on a plate and enjoy it as a simple and nutritious snack!

    Tips:
    - Bananas are a versatile fruit that can be enjoyed on their own or added to smoothies, oatmeal, or yogurt.
    - Customize your banana snack by experimenting with different toppings or spreads to suit your taste preferences.

    This easy and healthy banana snack is a perfect option for busy college students on-the-go!
    """.trimIndent()
        ),
        FoodItem(
            "Cereal and Milk",
            R.drawable.cereal_milk,
            "Breakfast",
            listOf("1 cup of your favorite cereal", "1 cup milk (any type you prefer)"),
            listOf("Optional: Fresh fruits (e.g., banana slices, berries)", "Optional: Nuts or seeds (e.g., almonds, chia seeds)", "Optional: Honey or maple syrup for sweetness"),
            listOf("Bowl", "Spoon"),
            """
    **Instructions for making Cereal and Milk:**

    1. **Pour Cereal:**
       - Pour 1 cup of your favorite cereal into a bowl.

    2. **Add Milk:**
       - Pour 1 cup of milk over the cereal in the bowl.

    3. **Optional Additions:**
       - If desired, add fresh fruits like banana slices or berries to the cereal.
       - Sprinkle nuts or seeds such as almonds or chia seeds for extra crunch and nutrition.
       - Drizzle honey or maple syrup over the cereal for added sweetness, if preferred.

    4. **Mix and Enjoy:**
       - Use a spoon to mix the cereal, milk, and optional toppings together.
       - Enjoy your simple and satisfying cereal and milk breakfast or snack!

    Tips:
    - Experiment with different types of cereal, milk, and toppings to create your perfect combination.
    - Cereal and milk can also be a quick and convenient meal option for busy college students.

    This quick and customizable cereal and milk is a versatile and satisfying option for any time of day!
    """.trimIndent()
        ),
        FoodItem(
            "Granola Bar",
            R.drawable.granola_bar,
            "Breakfest",
            listOf("1 granola bar (store-bought or homemade)"),
            listOf("Optional: Peanut butter or almond butter", "Optional: Chocolate chips", "Optional: Dried fruits (e.g., raisins, cranberries)", "Optional: Nuts or seeds (e.g., almonds, sunflower seeds)"),
            listOf("None"),
            """
    **Instructions for enjoying a Granola Bar:**

    1. **Unwrap the Granola Bar:**
       - Remove the granola bar from its packaging.

    2. **Optional Additions:**
       - If desired, spread a layer of peanut butter or almond butter on top of the granola bar for extra flavor and protein.
       - Sprinkle chocolate chips, dried fruits like raisins or cranberries, or nuts and seeds such as almonds or sunflower seeds over the granola bar for added texture and taste.

    3. **Enjoy:**
       - Take a bite and enjoy your convenient and tasty granola bar snack!

    Tips:
    - Granola bars are a versatile snack that can be customized with various toppings and flavors to suit your taste preferences.
    - Keep a few granola bars in your bag or backpack for a quick and satisfying snack on-the-go.

    This easy and portable granola bar is a great snack option for busy college students!
    """.trimIndent()
        ),
        FoodItem(
            "Greek Yogurt Parfait",
            R.drawable.greek_yogurt_parfait,
            "Breakfast",
            listOf("1 cup Greek yogurt (plain or flavored)", "1/2 cup granola", "1/2 cup mixed fresh fruits (e.g., berries, sliced banana)", "1 tablespoon honey or maple syrup (optional)"),
            listOf("Optional: Chia seeds or flaxseeds", "Optional: Nuts or nut butter (e.g., almonds, peanut butter)", "Optional: Coconut flakes or dark chocolate chips"),
            listOf("Bowl", "Spoon"),
            """
    **Instructions for making Greek Yogurt Parfait:**

    1. **Layer Greek Yogurt:**
       - In a bowl or glass, add a layer of Greek yogurt at the bottom.

    2. **Add Granola:**
       - Sprinkle a layer of granola over the Greek yogurt.

    3. **Add Fresh Fruits:**
       - Add a layer of mixed fresh fruits on top of the granola.

    4. **Repeat Layers:**
       - Repeat the layers of Greek yogurt, granola, and fresh fruits until the bowl or glass is filled.

    5. **Optional Toppings:**
       - Drizzle honey or maple syrup over the parfait for added sweetness, if desired.
       - Sprinkle chia seeds or flaxseeds, nuts or nut butter, coconut flakes, or dark chocolate chips on top for extra flavor, texture, and nutrition.

    6. **Serve:**
       - Use a spoon to mix the layers together or enjoy the parfait in layers.
       - Enjoy your nutritious and delicious Greek Yogurt Parfait breakfast!

    Tips:
    - Greek Yogurt Parfait is a versatile breakfast that can be customized with your favorite fruits, nuts, seeds, and sweeteners.
    - Make Greek Yogurt Parfait the night before and store it in the refrigerator for a quick and convenient breakfast option.

    This balanced and satisfying Greek Yogurt Parfait is a perfect breakfast choice to start your day energized and healthy!
    """.trimIndent()
        ),
        FoodItem(
            "Avocado Toast",
            R.drawable.avocado_toast,
            "Breakfast",
            listOf("1 slice whole-grain bread", "1 ripe avocado", "1/2 lemon, juiced", "Salt and pepper to taste"),
            listOf("Optional: Cherry tomatoes, sliced", "Optional: Red pepper flakes", "Optional: Poached or fried egg", "Optional: Feta cheese or goat cheese"),
            listOf("Toaster", "Knife", "Fork"),
            """
    **Instructions for making Avocado Toast:**

    1. **Toast the Bread:**
       - Toast a slice of whole-grain bread to your desired level of crispiness.

    2. **Prepare the Avocado:**
       - Cut the ripe avocado in half, remove the pit, and scoop the flesh into a bowl.
       - Add the lemon juice, salt, and pepper to the avocado.

    3. **Mash the Avocado:**
       - Use a fork to mash the avocado until it reaches your preferred consistency.

    4. **Assemble Avocado Toast:**
       - Spread the mashed avocado evenly onto the toasted bread slice.

    5. **Optional Toppings:**
       - If desired, add sliced cherry tomatoes, a sprinkle of red pepper flakes, a poached or fried egg, or crumbled feta or goat cheese on top of the avocado toast.

    6. **Serve:**
       - Enjoy your delicious and nutritious Avocado Toast for breakfast!

    Tips:
    - Avocado Toast is a versatile breakfast option that can be customized with various toppings and seasonings to suit your taste preferences.
    - For added protein, you can top your Avocado Toast with a poached or fried egg.

    This trendy and satisfying Avocado Toast is a perfect breakfast choice to fuel your morning and keep you energized!
    """.trimIndent()
        ),
//_________________________________________________________________________________________________________________________________________________________//


//LUNCH//


//_________________________________________________________________________________________________________________________________________________________//
        FoodItem(
            "Grilled Chicken",
            R.drawable.grilled_chicken,
            "Lunch",
            listOf("Chicken Breast", "Olive Oil", "Salt", "Pepper"),
            listOf("Optional: Garlic, Lemon"),
            listOf("Grill", "Tongs"),
            """
    **Instructions for making Grilled Chicken:**

    1. **Preparation:**
       - Preheat the grill to medium-high heat.
       - Pat dry the chicken breast with paper towels.

    2. **Season the Chicken:**
       - Drizzle olive oil over the chicken breast.
       - Season with salt and pepper to taste.
       - Add minced garlic and lemon zest for extra flavor, if desired.

    3. **Grill the Chicken:**
       - Place the seasoned chicken breast on the grill.
       - Grill for 6-8 minutes per side or until the internal temperature reaches 165°F (75°C).

    4. **Rest and Serve:**
       - Remove the grilled chicken from the grill and let it rest for a few minutes.
       - Slice and serve the grilled chicken with your favorite side dishes or salads.

    Tips:
    - For additional flavor, you can marinate the chicken breast in a mixture of olive oil, lemon juice, garlic, salt, and pepper for 30 minutes to 2 hours before grilling.
    - Serve the grilled chicken with a squeeze of fresh lemon juice or a drizzle of lemon herb sauce for extra zestiness.

    Enjoy your delicious and healthy Grilled Chicken for lunch!
    """.trimIndent()
        ),
        FoodItem(
            "Chicken Caesar Salad",
            R.drawable.salad,
            "Lunch",
            listOf("2 boneless, skinless chicken breasts", "1 head romaine lettuce, chopped", "1/2 cup Caesar dressing", "1/4 cup grated Parmesan cheese", "1 cup croutons"),
            listOf("Optional: cherry tomatoes, cucumber slices, boiled eggs"),
            listOf("Grill or frying pan", "Mixing bowl", "Serving plate"),
            """
    **Instructions for making Chicken Caesar Salad:**

    1. **Prepare Chicken:**
       - Season the chicken breasts with salt and pepper.
       - Grill or pan-fry the chicken until cooked through, about 6-7 minutes per side.
       - Let the chicken rest for a few minutes, then slice into strips.

    2. **Prepare Salad:**
       - In a large mixing bowl, combine the chopped romaine lettuce, Caesar dressing, and grated Parmesan cheese.
       - Toss well to coat the lettuce evenly.

    3. **Assemble Salad:**
       - Transfer the dressed lettuce to a serving plate.
       - Arrange the sliced chicken on top of the lettuce.
       - Sprinkle croutons over the salad.

    4. **Garnish (Optional):**
       - Add cherry tomatoes, cucumber slices, or boiled eggs for extra flavor and color.

    5. **Serve:**
       - Serve the Chicken Caesar Salad immediately, with additional Caesar dressing on the side if desired.

    Enjoy your refreshing Chicken Caesar Salad! You can customize it by adding your favorite veggies or toppings.
    """.trimIndent()
        ),
        FoodItem(
            "Peanut Butter and Jelly Sandwich",
            R.drawable.pbj_sandwich,
            "Lunch",
            listOf("2 slices of bread (white, wheat, or your choice)", "2 tablespoons peanut butter", "2 tablespoons jelly or jam (grape, strawberry, or your choice)"),
            listOf("Optional: Sliced banana", "Optional: Honey or maple syrup", "Optional: Cinnamon"),
            listOf("Knife", "Plate"),
            """
    **Instructions for making Peanut Butter and Jelly Sandwich:**

    1. **Prepare the Bread:**
       - Take 2 slices of bread of your choice and place them on a plate.

    2. **Spread Peanut Butter:**
       - Using a knife, spread 2 tablespoons of peanut butter evenly on one slice of bread.

    3. **Add Jelly or Jam:**
       - On the other slice of bread, spread 2 tablespoons of jelly or jam.

    4. **Assemble the Sandwich:**
       - Place the slice of bread with peanut butter on top of the slice with jelly or jam, creating a sandwich.

    5. **Optional Additions:**
       - If desired, add sliced banana, drizzle honey or maple syrup, or sprinkle cinnamon inside the sandwich for extra flavor and texture.

    6. **Serve and Enjoy:**
       - Cut the sandwich in half diagonally or into smaller pieces, if preferred.
       - Enjoy your classic Peanut Butter and Jelly Sandwich for lunch or as a snack!

    Tips:
    - Customize your Peanut Butter and Jelly Sandwich with different types of bread, peanut butter (crunchy or creamy), and jelly or jam flavors to suit your taste preferences.
    - For a more indulgent treat, try grilling the sandwich on a skillet with butter until golden brown and crispy.

    This simple and satisfying Peanut Butter and Jelly Sandwich is a timeless favorite that's perfect for any time of day!
    """.trimIndent()
        ),
        FoodItem(
            "Bean and Cheese Burrito",
            R.drawable.bean_cheese_burrito,
            "Lunch",
            listOf("1 large flour tortilla", "1/2 cup canned refried beans", "1/2 cup shredded cheese (cheddar, Monterey Jack, or your choice)", "1/4 cup salsa"),
            listOf("Optional: Sliced avocado or guacamole", "Optional: Sour cream", "Optional: Chopped cilantro", "Optional: Diced tomatoes or pico de gallo"),
            listOf("Skillet", "Spatula", "Microwave (optional)"),
            """
    **Instructions for making Bean and Cheese Burrito:**

    1. **Prepare the Tortilla:**
       - Warm the flour tortilla in a skillet over medium heat for a few seconds on each side or microwave it for 10-15 seconds to make it more pliable.

    2. **Assemble the Burrito:**
       - Spread the refried beans in the center of the tortilla.
       - Sprinkle shredded cheese over the beans.
       - Add salsa on top of the cheese.

    3. **Optional Additions:**
       - If desired, add sliced avocado or guacamole, sour cream, chopped cilantro, or diced tomatoes or pico de gallo on top of the bean and cheese mixture.

    4. **Fold and Roll the Burrito:**
       - Fold the sides of the tortilla over the filling.
       - Starting from the bottom, roll the tortilla up tightly to form a burrito.

    5. **Cook the Burrito:**
       - Place the burrito seam-side down in the skillet and cook for 2-3 minutes on each side until golden brown and crispy. Alternatively, you can wrap the burrito in foil and bake it in the oven at 350°F (175°C) for 10-15 minutes.

    6. **Serve and Enjoy:**
       - Cut the burrito in half diagonally or serve it whole.
       - Enjoy your flavorful and satisfying Bean and Cheese Burrito for lunch or dinner!

    Tips:
    - Customize your Bean and Cheese Burrito by adding your favorite toppings and fillings such as grilled vegetables, rice, or meat.
    - Serve the burrito with extra salsa, guacamole, or sour cream on the side for dipping or drizzling.

    This easy and delicious Bean and Cheese Burrito is a classic Mexican-inspired dish that's perfect for a quick and tasty meal!
    """.trimIndent()
        ),
        FoodItem(
            "Leftover Pasta",
            R.drawable.leftover_pasta,
            "Lunch",
            listOf("Leftover cooked pasta (spaghetti, penne, or your choice)", "2-3 tablespoons olive oil or butter", "Salt and pepper to taste"),
            listOf("Optional: Grated Parmesan or other cheese", "Optional: Fresh herbs (e.g., basil, parsley)", "Optional: Sliced vegetables (e.g., cherry tomatoes, spinach)"),
            listOf("Skillet", "Spatula", "Plate"),
            """
    **Instructions for making Leftover Pasta:**

    1. **Heat the Pasta:**
       - In a skillet, warm the leftover cooked pasta over medium heat with 2-3 tablespoons of olive oil or butter.

    2. **Season the Pasta:**
       - Season the pasta with salt and pepper to taste and toss to combine.

    3. **Optional Additions:**
       - If desired, add grated Parmesan or other cheese, fresh herbs like basil or parsley, and sliced vegetables such as cherry tomatoes or spinach to the skillet. Stir well to incorporate.

    4. **Cook and Stir:**
       - Cook the pasta for 2-3 minutes, stirring frequently, until it's heated through and any added cheese is melted.

    5. **Serve:**
       - Transfer the heated and seasoned leftover pasta to a plate.
       - Garnish with additional grated cheese, herbs, or a drizzle of olive oil if desired.

    Tips:
    - Leftover Pasta is a versatile dish that can be easily customized with various seasonings, cheeses, and additional ingredients.
    - For added protein, you can toss in leftover cooked chicken, shrimp, or tofu with the pasta.

    Enjoy your quick and delicious Leftover Pasta for a convenient and satisfying lunch or dinner!
    """.trimIndent()
        ),
        FoodItem(
            "Vegetable Soup",
            R.drawable.vegetable_soup,
            "Lunch",
            listOf("2 cups mixed vegetables (carrots, celery, onions, bell peppers, etc.)", "4 cups vegetable broth or water", "1 can (14 oz) diced tomatoes", "2 cloves garlic, minced"),
            listOf("Optional: 1 cup cooked beans (kidney beans, chickpeas, or your choice)", "Optional: 1 teaspoon dried herbs (thyme, rosemary, or basil)", "Optional: Salt and pepper to taste"),
            listOf("Large pot", "Spoon", "Knife"),
            """
    **Instructions for making Vegetable Soup:**

    1. **Prepare the Vegetables:**
       - Wash and chop the mixed vegetables into bite-sized pieces.

    2. **Sauté the Vegetables:**
       - In a large pot, heat a tablespoon of olive oil or butter over medium heat.
       - Add the chopped vegetables and minced garlic to the pot. Sauté for 5-7 minutes, or until the vegetables begin to soften.

    3. **Add Liquid and Tomatoes:**
       - Pour in the vegetable broth or water and the diced tomatoes (with their juices) into the pot. Stir to combine.

    4. **Optional Additions:**
       - If using cooked beans, add them to the pot.
       - Sprinkle in dried herbs like thyme, rosemary, or basil for added flavor.
       - Season with salt and pepper to taste.

    5. **Simmer the Soup:**
       - Bring the soup to a boil, then reduce the heat to low.
       - Cover and simmer for 20-30 minutes, or until the vegetables are tender and the flavors have melded together.

    6. **Serve:**
       - Ladle the hot Vegetable Soup into bowls.
       - Garnish with fresh herbs, a drizzle of olive oil, or a sprinkle of grated Parmesan cheese if desired.

    Tips:
    - Vegetable Soup is a versatile dish, so feel free to customize it with your favorite vegetables, herbs, and spices.
    - Serve the soup with crusty bread or a side salad for a complete and satisfying meal.

    This wholesome and comforting Vegetable Soup is perfect for warming up on a chilly day and is packed with nutritious vegetables!
    """.trimIndent()
        ),
        FoodItem(
            "Quesadilla",
            R.drawable.quesadilla,
            "Lunch/Dinner",
            listOf("2 large flour tortillas", "1 cup shredded cheese (cheddar, Monterey Jack, or your choice)", "1/2 cup cooked chicken, beef, or beans (optional)", "1/4 cup diced bell peppers (any color)", "1/4 cup diced onions"),
            listOf("Optional: Sliced jalapeños", "Optional: Sliced avocado or guacamole", "Optional: Sour cream", "Optional: Salsa or pico de gallo"),
            listOf("Skillet", "Spatula", "Knife"),
            """
    **Instructions for making Quesadilla:**

    1. **Prepare the Filling:**
       - In a mixing bowl, combine the shredded cheese, diced bell peppers, and onions. If using cooked chicken, beef, or beans, add them to the filling mixture as well.

    2. **Assemble the Quesadilla:**
       - Place one flour tortilla on a flat surface.
       - Spread the filling mixture evenly over half of the tortilla.
       - Optional: Add sliced jalapeños, avocado or guacamole, sour cream, or salsa on top of the filling.

    3. **Fold and Cook the Quesadilla:**
       - Fold the other half of the tortilla over the filling to create a half-moon shape.

    4. **Cook the Quesadilla:**
       - Heat a skillet over medium heat and place the assembled quesadilla in the skillet.
       - Cook for 2-3 minutes on each side, or until the tortilla is golden brown and the cheese is melted.

    5. **Serve:**
       - Remove the quesadilla from the skillet and place it on a cutting board.
       - Cut the quesadilla into wedges using a knife or pizza cutter.
       - Serve hot with sour cream, salsa, or pico de gallo on the side.

    Tips:
    - Quesadillas are versatile and can be customized with various fillings such as different types of cheese, meats, vegetables, and toppings.
    - For a crispy exterior, you can brush the outside of the tortilla with a little oil or butter before cooking.

    Enjoy your delicious and cheesy Quesadilla for a quick and satisfying meal!
    """.trimIndent()
        ),
        FoodItem(
            "BLT Sandwich",
            R.drawable.blt_sandwich,
            "Lunch",
            listOf("2 slices of bread (white, wheat, or your choice)", "3-4 strips of bacon", "1-2 lettuce leaves (Romaine or iceberg)", "1-2 slices of tomato"),
            listOf("Optional: Mayonnaise", "Optional: Sliced avocado", "Optional: Sliced cheese (cheddar or Swiss)", "Optional: Fresh basil or parsley"),
            listOf("Skillet or Oven", "Toaster", "Knife"),
            """
    **Instructions for making BLT Sandwich:**

    1. **Cook the Bacon:**
       - In a skillet over medium heat, cook the bacon strips until they are crispy. Alternatively, you can bake the bacon in the oven at 400°F (200°C) for 15-20 minutes.

    2. **Prepare the Bread:**
       - Toast the slices of bread to your desired level of crispiness.

    3. **Assemble the BLT:**
       - Spread mayonnaise on one or both slices of toasted bread, if desired.
       - Layer the lettuce leaves, tomato slices, and cooked bacon on one slice of bread.

    4. **Optional Additions:**
       - If using, add sliced avocado, cheese, or fresh basil or parsley on top of the bacon layer.

    5. **Complete the Sandwich:**
       - Place the other slice of toasted bread on top of the filling to complete the sandwich.

    6. **Serve:**
       - Cut the BLT sandwich in half diagonally or serve it whole.
       - Enjoy your classic and delicious BLT Sandwich for lunch!

    Tips:
    - Customize your BLT Sandwich with your favorite ingredients and condiments to suit your taste preferences.
    - For a twist on the classic BLT, try adding sliced avocado, cheese, or fresh herbs to elevate the flavors.

    This timeless BLT Sandwich is a simple and satisfying lunch option that's perfect for any day of the week!
    """.trimIndent()
        ),
        FoodItem(
            "Instant Noodles",
            R.drawable.instant_noodles,
            "Lunch",
            listOf("1 packet of instant noodles (ramen, udon, or your choice)", "Water (as per packet instructions)", "Seasoning packet included with the noodles"),
            listOf("Optional: Sliced vegetables (carrots, bell peppers, or spinach)", "Optional: Cooked protein (chicken, beef, tofu, or eggs)", "Optional: Fresh herbs (green onions, cilantro)"),
            listOf("Pot", "Stove or Microwave", "Bowl", "Fork or Chopsticks"),
            """
    **Instructions for making Instant Noodles:**

    1. **Boil Water:**
       - In a pot, bring the specified amount of water to a boil as per the instructions on the instant noodle packet.

    2. **Cook the Noodles:**
       - Add the instant noodles to the boiling water and cook according to the packet instructions, usually for 2-3 minutes.

    3. **Add Seasoning:**
       - Once the noodles are cooked, remove the pot from heat.
       - Add the seasoning packet included with the noodles and stir well to combine.

    4. **Optional Additions:**
       - For added flavor and nutrition, you can add sliced vegetables, cooked protein, or fresh herbs to the noodles. Cooked vegetables or protein can be added to the pot while the noodles are cooking or added to the bowl before serving.

    5. **Serve:**
       - Transfer the cooked instant noodles to a bowl using a fork or chopsticks.
       - Enjoy your quick and easy Instant Noodles while hot!

    Tips:
    - Customize your Instant Noodles with your favorite toppings and ingredients to enhance the flavor and make the dish more nutritious.
    - To make the noodles more filling, you can add an egg during the last minute of cooking to poach it directly in the broth.

    Instant Noodles are a convenient and versatile meal option that can be easily customized to suit your taste preferences and cravings!
    """.trimIndent()
        ),
        FoodItem(
            "Grilled Cheese Sandwich",
            R.drawable.grilled_cheese_sandwich,
            "Lunch",
            listOf("2 slices of bread (white, wheat, or your choice)", "1-2 tablespoons butter or margarine", "1-1.5 cups shredded cheese (cheddar, American, or your favorite melting cheese)"),
            listOf("Optional: Sliced tomato", "Optional: Cooked bacon or ham", "Optional: Sliced avocado", "Optional: Mustard or mayonnaise"),
            listOf("Skillet", "Spatula", "Knife"),
            """
    **Instructions for making Grilled Cheese Sandwich:**

    1. **Prepare the Bread:**
       - Spread butter or margarine on one side of each slice of bread.

    2. **Assemble the Sandwich:**
       - Place the cheese on the unbuttered side of one slice of bread.
       - Optional: Add sliced tomato, cooked bacon or ham, sliced avocado, mustard, or mayonnaise on top of the cheese.

    3. **Cook the Sandwich:**
       - Heat a skillet over medium heat.
       - Place the assembled sandwich in the skillet, buttered side down.

    4. **Grill the Sandwich:**
       - Cook the sandwich for 2-3 minutes on each side, or until the bread is golden brown and the cheese is melted.

    5. **Serve:**
       - Remove the grilled cheese sandwich from the skillet and place it on a cutting board.
       - Cut the sandwich in half diagonally or serve it whole.
       - Enjoy your delicious and gooey Grilled Cheese Sandwich while hot!

    Tips:
    - Customize your Grilled Cheese Sandwich with your favorite cheese and additional fillings to suit your taste preferences.
    - For extra flavor, you can sprinkle grated Parmesan or add a pinch of herbs (such as oregano or basil) on the buttered side of the bread before grilling.

    This classic and comforting Grilled Cheese Sandwich is a quick and satisfying lunch option that's perfect for any day of the week!
    """.trimIndent()
        ),
//_________________________________________________________________________________________________________________________________________________________//


//DINNER//


//_________________________________________________________________________________________________________________________________________________________//
        FoodItem(
            "Spaghetti Bolognese",
            R.drawable.spaghetti_bolognese,
            "Dinner",
            listOf("Spaghetti", "Ground Beef", "Tomato Sauce"),
            listOf("Optional: Garlic, Onion"),
            listOf("Pot, Spoon"),
            """
    **Instructions for making Spaghetti Bolognese:**

    1. **Cook the Spaghetti:**
       - In a pot of boiling water, cook the spaghetti according to the package instructions until al dente. Drain and set aside.

    2. **Prepare the Sauce:**
       - In a separate pot or skillet, sauté minced garlic and chopped onion in a little olive oil until softened.
       - Add the ground beef to the pot and cook until browned and fully cooked through.
       - Pour in the tomato sauce and stir to combine with the meat mixture.

    3. **Simmer the Sauce:**
       - Reduce the heat to low and let the sauce simmer for 15-20 minutes to allow the flavors to meld together and the sauce to thicken slightly.

    4. **Combine Spaghetti and Sauce:**
       - Add the cooked spaghetti to the pot with the bolognese sauce and toss to coat the pasta evenly with the sauce.

    5. **Serve:**
       - Transfer the Spaghetti Bolognese to plates or bowls.
       - Garnish with grated Parmesan cheese and fresh basil or parsley, if desired.
       - Enjoy your hearty and flavorful Spaghetti Bolognese for dinner!

    Tips:
    - Feel free to add additional seasonings and herbs such as oregano, basil, or red pepper flakes to the sauce for extra flavor.
    - Serve the Spaghetti Bolognese with a side of garlic bread or a fresh salad to complete the meal.

    This classic Spaghetti Bolognese recipe is a comforting and satisfying dinner option that's perfect for any night of the week!
    """.trimIndent()
        ),
        FoodItem(
            "Rice and Beans",
            R.drawable.rice_and_beans,
            "Dinner",
            listOf("1 cup white rice (or brown rice)", "1 can (15 oz) black beans (or red beans)", "2 cups water or vegetable broth", "Salt to taste"),
            listOf("Optional: Diced onion", "Optional: Minced garlic", "Optional: Sliced bell peppers", "Optional: Cilantro or parsley for garnish"),
            listOf("Pot", "Spoon", "Saucepan"),
            """
    **Instructions for making Rice and Beans:**

    1. **Prepare the Rice:**
       - In a saucepan, combine the rice and water or vegetable broth. Bring to a boil over high heat.

    2. **Cook the Rice:**
       - Reduce the heat to low, cover, and simmer for 18-20 minutes, or until the rice is cooked and the liquid is absorbed.

    3. **Prepare the Beans:**
       - While the rice is cooking, rinse and drain the canned beans. Set aside.

    4. **Sauté Optional Ingredients:**
       - In a separate pot or skillet, sauté diced onion, minced garlic, and sliced bell peppers in a little olive oil until softened, if using.

    5. **Combine Rice and Beans:**
       - Once the rice is cooked, add the beans to the saucepan with the rice.
       - Stir to combine and heat through.

    6. **Season and Serve:**
       - Season the rice and beans with salt to taste.
       - Garnish with chopped cilantro or parsley, if desired.
       - Serve your delicious and hearty Rice and Beans as a main dish or side.

    Tips:
    - Customize your Rice and Beans with your favorite seasonings and optional ingredients to suit your taste preferences.
    - For added flavor, you can use vegetable broth instead of water when cooking the rice or add spices like cumin, paprika, or chili powder to the beans.

    This simple and nutritious Rice and Beans dish is a staple in many cuisines and makes a satisfying and budget-friendly meal for lunch or dinner!
    """.trimIndent()
        ),
        FoodItem(
            "Tuna Pasta Salad",
            R.drawable.tuna_pasta_salad,
            "Dinner",
            listOf("2 cups pasta (elbow macaroni, rotini, or your choice)", "1 can (5 oz) tuna in water, drained", "1/2 cup mayonnaise or Greek yogurt", "1/4 cup diced celery"),
            listOf("Optional: Diced red onion", "Optional: Diced bell pepper (any color)", "Optional: Sweet corn kernels", "Optional: Chopped fresh parsley or dill for garnish"),
            listOf("Pot", "Mixing bowl", "Spoon"),
            """
    **Instructions for making Tuna Pasta Salad:**

    1. **Cook the Pasta:**
       - In a pot of boiling salted water, cook the pasta according to the package instructions until al dente. Drain and rinse under cold water to stop the cooking process.

    2. **Prepare the Tuna:**
       - Drain the tuna from the can and flake it into bite-sized pieces using a fork.

    3. **Mix the Salad:**
       - In a large mixing bowl, combine the cooked and cooled pasta, flaked tuna, diced celery, and any optional ingredients you are using (such as red onion, bell pepper, or sweet corn).

    4. **Add the Dressing:**
       - Add mayonnaise or Greek yogurt to the bowl with the pasta and tuna mixture.
       - Stir well to coat all the ingredients evenly with the dressing.

    5. **Season and Chill:**
       - Season the Tuna Pasta Salad with salt and pepper to taste.
       - Cover the bowl with plastic wrap and refrigerate for at least 1 hour to allow the flavors to meld together and the salad to chill.

    6. **Serve:**
       - Remove the Tuna Pasta Salad from the refrigerator.
       - Garnish with chopped fresh parsley or dill, if desired, before serving.
       - Enjoy your refreshing and flavorful Tuna Pasta Salad for lunch or dinner!

    Tips:
    - Customize your Tuna Pasta Salad with your favorite vegetables and additional ingredients to suit your taste preferences.
    - For added zest, you can squeeze fresh lemon juice or add a dash of mustard to the dressing.

    This Tuna Pasta Salad is a light and satisfying dish that's perfect for a quick and easy meal, and it can also be made ahead of time for meal prep!
    """.trimIndent()
        ),
        FoodItem(
            "Couscous with Vegetables",
            R.drawable.couscous_with_vegetables,
            "Dinner",
            listOf("1 cup couscous", "1.5 cups water or vegetable broth", "1 cup mixed vegetables (bell peppers, zucchini, carrots, etc.)", "2 tablespoons olive oil"),
            listOf("Optional: Diced onion", "Optional: Minced garlic", "Optional: Chickpeas or other beans", "Optional: Fresh herbs (parsley, cilantro) for garnish"),
            listOf("Saucepan", "Skillet", "Mixing bowl", "Fork"),
            """
    **Instructions for making Couscous with Vegetables:**

    1. **Prepare the Couscous:**
       - In a saucepan, bring the water or vegetable broth to a boil.
       - Stir in the couscous, cover the saucepan, and remove it from heat. Let it sit for 5 minutes to allow the couscous to absorb the liquid.
       - Fluff the cooked couscous with a fork to separate the grains.

    2. **Sauté the Vegetables:**
       - While the couscous is cooking, heat olive oil in a skillet over medium heat.
       - Add the mixed vegetables and optional diced onion and minced garlic to the skillet. Sauté for 5-7 minutes, or until the vegetables are tender.

    3. **Combine Couscous and Vegetables:**
       - Transfer the cooked couscous to a large mixing bowl.
       - Add the sautéed vegetables and optional chickpeas or other beans to the bowl.
       - Stir well to combine all the ingredients.

    4. **Season and Serve:**
       - Season the Couscous with Vegetables with salt and pepper to taste.
       - Garnish with fresh herbs such as parsley or cilantro, if desired.
       - Serve your flavorful and nutritious Couscous with Vegetables as a main dish or side.

    Tips:
    - Customize your Couscous with Vegetables by using your favorite vegetables and additional ingredients.
    - For added flavor, you can sprinkle the couscous with lemon juice or add spices like cumin, coriander, or paprika.

    This Couscous with Vegetables recipe is a quick, easy, and versatile dish that's perfect for a healthy lunch or dinner!
    """.trimIndent()
        ),
        FoodItem(
            "Peanut Butter and Banana Sandwich",
            R.drawable.peanut_butter_banana_sandwich,
            "Dinner",
            listOf("2 slices of bread (white, wheat, or your choice)", "2-3 tablespoons peanut butter", "1 ripe banana, sliced"),
            listOf("Optional: Honey or maple syrup", "Optional: Cinnamon", "Optional: Chopped nuts (walnuts, almonds)"),
            listOf("Knife", "Plate"),
            """
    **Instructions for making Peanut Butter and Banana Sandwich:**

    1. **Prepare the Bread:**
       - Place the slices of bread on a clean plate or cutting board.

    2. **Spread Peanut Butter:**
       - Spread peanut butter evenly on one side of each slice of bread.

    3. **Slice and Arrange Banana:**
       - Peel the ripe banana and slice it into rounds.
       - Arrange the banana slices on one slice of bread, on top of the peanut butter.

    4. **Optional Additions:**
       - Drizzle honey or maple syrup over the banana slices for added sweetness, if desired.
       - Sprinkle cinnamon or chopped nuts over the banana slices for extra flavor and crunch.

    5. **Assemble the Sandwich:**
       - Place the other slice of bread, peanut butter side down, on top of the banana slices to form a sandwich.

    6. **Serve:**
       - Cut the Peanut Butter and Banana Sandwich in half diagonally or serve it whole.
       - Enjoy your delicious and satisfying Peanut Butter and Banana Sandwich for breakfast, lunch, or as a snack!

    Tips:
    - Customize your Peanut Butter and Banana Sandwich with your favorite type of bread, peanut butter, and optional additions to suit your taste preferences.
    - For a twist on the classic sandwich, you can also add other ingredients like jam, Nutella, or sliced strawberries.

    This Peanut Butter and Banana Sandwich is a classic and nutritious choice that's quick and easy to make for any meal or snack!
    """.trimIndent()
        ),
        FoodItem(
            "Chicken Alfredo",
            R.drawable.chicken_alfredo,
            "Dinner",
            listOf("2 boneless, skinless chicken breasts", "8 oz fettuccine pasta", "2 cups heavy cream", "1 cup grated Parmesan cheese"),
            listOf("Optional: 2 cloves garlic, minced", "Optional: 1 cup sliced mushrooms", "Optional: 1 cup broccoli florets", "Optional: Fresh parsley for garnish"),
            listOf("Skillet", "Pot", "Saucepan", "Cooking spoon"),
            """
    **Instructions for making Chicken Alfredo:**

    1. **Cook the Pasta:**
       - In a pot of boiling salted water, cook the fettuccine pasta according to package instructions until al dente. Drain and set aside.

    2. **Cook the Chicken:**
       - Season the chicken breasts with salt and pepper.
       - In a skillet over medium heat, cook the chicken breasts until golden brown and cooked through, about 6-7 minutes per side. Remove from skillet and set aside.

    3. **Prepare the Alfredo Sauce:**
       - In the same skillet, add minced garlic and sliced mushrooms (if using) and sauté until softened.
       - Pour in the heavy cream, bring to a simmer, and let it reduce slightly for about 2-3 minutes.
       - Gradually stir in the grated Parmesan cheese until the sauce is smooth and creamy. Season with salt and pepper to taste.

    4. **Combine Pasta, Sauce, and Chicken:**
       - Slice the cooked chicken breasts into thin strips.
       - Add the cooked fettuccine pasta to the skillet with the Alfredo sauce and toss to coat the pasta evenly.
       - Arrange the sliced chicken on top of the pasta and sauce.

    5. **Optional Additions:**
       - If using, add broccoli florets to the skillet with the pasta and sauce, and toss to combine. Cook for an additional 2-3 minutes until the broccoli is tender.

    6. **Serve:**
       - Transfer the Chicken Alfredo to plates or bowls.
       - Garnish with fresh parsley, if desired.
       - Enjoy your rich and creamy Chicken Alfredo for a comforting and satisfying dinner!

    Tips:
    - Customize your Chicken Alfredo with optional ingredients and spices to suit your taste preferences.
    - For added flavor, you can also incorporate herbs like basil or thyme into the Alfredo sauce.

    This Chicken Alfredo recipe is a classic and indulgent dinner option that's perfect for special occasions or a cozy night in!
    """.trimIndent()
        ),
        FoodItem(
            "One-Pan Chicken and Rice",
            R.drawable.one_pan_chicken_rice,
            "Dinner",
            listOf("2 boneless, skinless chicken breasts", "1 cup white rice", "2 cups chicken broth", "1 cup mixed vegetables (frozen or fresh)"),
            listOf("Optional: 1 clove garlic, minced", "Optional: 1 teaspoon dried herbs (thyme, rosemary)", "Optional: 1/2 cup diced onion", "Optional: 1 tablespoon olive oil"),
            listOf("Large skillet or frying pan", "Lid or aluminum foil", "Cooking spoon"),
            """
    **Instructions for making One-Pan Chicken and Rice:**

    1. **Prepare the Chicken:**
       - Season the chicken breasts with salt, pepper, and any optional dried herbs you're using.

    2. **Sauté the Chicken:**
       - Heat a large skillet or frying pan over medium-high heat.
       - Add olive oil to the pan and sear the seasoned chicken breasts for 2-3 minutes on each side, until browned. Remove the chicken from the pan and set aside.

    3. **Sauté the Vegetables:**
       - If using, add minced garlic and diced onion to the same pan. Sauté for 1-2 minutes until fragrant.

    4. **Add Rice and Broth:**
       - Pour the white rice into the pan with the sautéed vegetables.
       - Add chicken broth to the pan, stirring to combine and scraping up any browned bits from the bottom of the pan.

    5. **Cook the Chicken and Rice:**
       - Return the seared chicken breasts to the pan, nestling them into the rice mixture.
       - Bring the liquid to a boil, then reduce the heat to low, cover the pan with a lid or aluminum foil, and simmer for 18-20 minutes, or until the rice is cooked and the chicken is tender and cooked through.

    6. **Add Vegetables:**
       - Stir in the mixed vegetables (frozen or fresh) to the pan during the last 5 minutes of cooking, allowing them to heat through.

    7. **Serve:**
       - Remove the pan from heat and let it rest, covered, for a few minutes.
       - Fluff the rice with a fork and check for seasoning, adding salt and pepper if necessary.
       - Serve your One-Pan Chicken and Rice directly from the skillet for a convenient and satisfying dinner!

    Tips:
    - Customize your One-Pan Chicken and Rice with your favorite vegetables, spices, and herbs to suit your taste preferences.
    - This dish can also be made with brown rice, adjusting the cooking time and liquid as needed.

    This One-Pan Chicken and Rice recipe is a simple, hearty, and budget-friendly dinner option that requires minimal prep and cleanup, making it ideal for busy college students!
    """.trimIndent()
        ),
        FoodItem(
            "Vegetable Fried Rice",
            R.drawable.vegetable_fried_rice,
            "Dinner",
            listOf("2 cups cooked rice (white or brown)", "1 cup mixed vegetables (frozen or fresh: carrots, peas, corn)", "2 eggs, beaten", "3 tablespoons soy sauce"),
            listOf("Optional: 1 clove garlic, minced", "Optional: 1/2 cup diced onion", "Optional: 1/2 cup diced chicken or tofu", "Optional: 2 tablespoons vegetable oil"),
            listOf("Large skillet or frying pan", "Cooking spoon", "Bowl"),
            """
    **Instructions for making Vegetable Fried Rice:**

    1. **Prepare the Ingredients:**
       - If you haven't cooked the rice yet, do so according to package instructions and let it cool. Leftover rice works great for this recipe!

    2. **Sauté the Vegetables and Protein:**
       - Heat a large skillet or frying pan over medium-high heat.
       - If using, add vegetable oil to the pan, then sauté the diced onion and minced garlic for 1-2 minutes until fragrant.
       - Add the diced chicken or tofu (if using) and cook until browned.

    3. **Cook the Eggs:**
       - Push the cooked vegetables and protein to one side of the pan.
       - Pour the beaten eggs into the empty side of the pan and scramble them until fully cooked.

    4. **Combine Everything:**
       - Mix the scrambled eggs with the vegetables and protein in the pan.
       - Add the cooked rice and mixed vegetables to the skillet, stirring to combine all the ingredients evenly.

    5. **Add Soy Sauce:**
       - Pour soy sauce over the rice and vegetable mixture, stirring well to coat everything evenly.

    6. **Cook and Stir-Fry:**
       - Continue to stir-fry the Vegetable Fried Rice for another 3-5 minutes, ensuring all ingredients are heated through and well combined.

    7. **Serve:**
       - Transfer the Vegetable Fried Rice to plates or bowls.
       - Enjoy your quick and flavorful Vegetable Fried Rice as a satisfying dinner or meal prep option!

    Tips:
    - Customize your Vegetable Fried Rice with your favorite vegetables, protein, and additional seasonings or spices to suit your taste preferences.
    - You can add a dash of sesame oil or garnish with chopped green onions for extra flavor.

    This Vegetable Fried Rice recipe is a versatile and affordable dinner option that's perfect for busy college students looking for a quick and delicious meal!
    """.trimIndent()
        ),
        FoodItem(
            "Pasta with Tomato Sauce",
            R.drawable.pasta_tomato_sauce,
            "Dinner",
            listOf("8 oz pasta (spaghetti, penne, or your choice)", "2 cups tomato sauce (store-bought or homemade)", "1/2 cup grated Parmesan cheese", "2 tablespoons olive oil"),
            listOf("Optional: 1 clove garlic, minced", "Optional: 1/2 cup diced onion", "Optional: 1/4 teaspoon red pepper flakes", "Optional: Fresh basil leaves for garnish"),
            listOf("Large pot", "Skillet", "Cooking spoon"),
            """
    **Instructions for making Pasta with Tomato Sauce:**

    1. **Cook the Pasta:**
       - Bring a large pot of salted water to a boil.
       - Add the pasta and cook according to package instructions until al dente. Drain and set aside, reserving a cup of pasta cooking water.

    2. **Prepare the Sauce:**
       - In a skillet, heat olive oil over medium heat.
       - If using, add minced garlic and diced onion to the skillet. Sauté for 1-2 minutes until fragrant and translucent.
       - Pour in the tomato sauce and red pepper flakes (if using). Simmer for 5-7 minutes to allow the flavors to meld together.

    3. **Combine Pasta and Sauce:**
       - Add the cooked pasta to the skillet with the tomato sauce.
       - Toss to coat the pasta evenly with the sauce. If the sauce is too thick, you can add a bit of the reserved pasta cooking water to thin it out.

    4. **Add Parmesan Cheese:**
       - Stir in the grated Parmesan cheese until it's melted and incorporated into the sauce.

    5. **Serve:**
       - Transfer the Pasta with Tomato Sauce to plates or bowls.
       - Garnish with fresh basil leaves, if desired.
       - Enjoy your simple and satisfying Pasta with Tomato Sauce for a quick and tasty dinner!

    Tips:
    - Customize your Pasta with Tomato Sauce by adding your favorite vegetables, protein, or herbs to the sauce.
    - For extra flavor, you can also sprinkle additional grated Parmesan cheese or a drizzle of olive oil over the pasta before serving.

    This Pasta with Tomato Sauce recipe is a classic and comforting dinner option that's perfect for busy college students on a budget!
    """.trimIndent()
        ),
        FoodItem(
            "Tuna and Veggie Rice Bowl",
            R.drawable.tuna_veggie_rice_bowl,
            "Dinner",
            listOf("1 cup cooked rice (white or brown)", "1 can (5 oz) tuna in water, drained", "1 cup mixed vegetables (frozen or fresh: bell peppers, carrots, broccoli)", "2 tablespoons soy sauce"),
            listOf("Optional: 1 clove garlic, minced", "Optional: 1/2 cup diced onion", "Optional: 1 tablespoon sesame oil", "Optional: 1 tablespoon chopped green onions for garnish"),
            listOf("Large skillet or frying pan", "Cooking spoon", "Bowl"),
            """
    **Instructions for making Tuna and Veggie Rice Bowl:**

    1. **Cook the Rice:**
       - If you haven't cooked the rice yet, do so according to package instructions and set aside.

    2. **Prepare the Vegetables:**
       - If using fresh vegetables, wash and chop them into bite-sized pieces.

    3. **Sauté the Vegetables:**
       - Heat a large skillet or frying pan over medium-high heat.
       - If using, add sesame oil to the pan, then sauté the diced onion and minced garlic for 1-2 minutes until fragrant.
       - Add the mixed vegetables to the skillet and stir-fry for 3-4 minutes until they are crisp-tender.

    4. **Add Tuna:**
       - Add the drained tuna to the skillet with the vegetables, breaking it up with a spoon to combine.

    5. **Combine with Rice:**
       - Add the cooked rice to the skillet, stirring to combine all the ingredients evenly.

    6. **Add Soy Sauce:**
       - Pour soy sauce over the rice and vegetable mixture, stirring well to coat everything evenly.

    7. **Cook and Stir-Fry:**
       - Continue to stir-fry the Tuna and Veggie Rice Bowl for another 2-3 minutes, ensuring all ingredients are heated through and well combined.

    8. **Serve:**
       - Transfer the Tuna and Veggie Rice Bowl to a bowl.
       - Garnish with chopped green onions, if desired.
       - Enjoy your quick and nutritious Tuna and Veggie Rice Bowl for a satisfying dinner!

    Tips:
    - Customize your Tuna and Veggie Rice Bowl with your favorite vegetables, spices, and additional sauces to suit your taste preferences.
    - This dish can also be made with other proteins like chicken, tofu, or shrimp.

    This Tuna and Veggie Rice Bowl recipe is a simple and budget-friendly dinner option that's packed with protein and veggies, making it ideal for busy college students!
    """.trimIndent()
        ),
//_________________________________________________________________________________________________________________________________________________________//


//DESSERT/SNACK//


//_________________________________________________________________________________________________________________________________________________________//
        FoodItem(
            "Chocolate Cake",
            R.drawable.explore,
            "Snack/Dessert",
            listOf("Flour", "Sugar", "Cocoa Powder", "Baking Powder","Milk", "Eggs" ),
            listOf("Oven", "Mixing Bowl"),
            """
    **Instructions for making Chocolate Cake:**

    1. **Preheat Oven:**
       - Preheat your oven to 350°F (175°C). Grease and flour a cake pan or line it with parchment paper.

    2. **Prepare Dry Ingredients:**
       - In a mixing bowl, sift together flour, cocoa powder, sugar, and baking powder. Mix well to combine.

    3. **Prepare Wet Ingredients:**
       - In another bowl, whisk together milk and eggs until well blended.

    4. **Combine Dry and Wet Ingredients:**
       - Gradually add the wet ingredients to the dry ingredients, stirring until smooth and well combined.

    5. **Pour Batter into Pan:**
       - Pour the batter into the prepared cake pan, spreading it evenly.

    6. **Bake:**
       - Place the cake pan in the preheated oven and bake for 25-30 minutes, or until a toothpick inserted into the center comes out clean.

    7. **Cool and Serve:**
       - Remove the cake from the oven and let it cool in the pan for 10 minutes.
       - Transfer the cake to a wire rack to cool completely before slicing and serving.

    Enjoy your delicious homemade Chocolate Cake!
    """.trimIndent()
        ),
        FoodItem(
            "3-ingredient Peanut Butter Cookies",
            R.drawable.explore,  // Replace with the actual image resource ID
            "Snack/Dessert",
            listOf("1 cup peanut butter", "1 cup white sugar", "1 large egg"),
            listOf("Optional: chocolate chips, chopped nuts"),
            listOf("Convection Oven", "Electric mixer", "Baking sheet", "Wire rack"),
            """
    **Instructions for making 3-ingredient Peanut Butter Cookies:**

    1. **Preheat Oven:**
       - Preheat the oven to 350 degrees F (175 degrees C).

    2. **Mix Ingredients:**
       - In a bowl, combine peanut butter, sugar, and egg.
       - Use an electric mixer to blend them together until smooth and creamy.

    3. **Form Cookies:**
       - Roll the mixture into 1-inch balls.
       - Place the balls 1 inch apart on an ungreased baking sheet.

    4. **Flatten Cookies:**
       - Use a fork to flatten each ball, creating a criss-cross pattern on top.

    5. **Bake:**
       - Bake the cookies in the preheated oven for about 10 minutes, or until the edges are firm.
       - Allow the cookies to cool on the baking sheet for a few minutes before transferring them to a wire rack to cool completely.

    Enjoy your delicious and easy 3-ingredient Peanut Butter Cookies!
    """.trimIndent()
        ),

        FoodItem(
            "Fruit Salad",
            R.drawable.fruit_salad,
            "Snack/Dessert",
            listOf("1 apple, diced", "1 banana, sliced", "1 cup strawberries, quartered", "1 cup grapes, halved", "1 kiwi, peeled and diced"),
            listOf("Optional: Honey or maple syrup for sweetness", "Optional: Fresh mint leaves for garnish"),
            listOf("Mixing bowl", "Knife", "Cutting board"),
            """
    **Instructions for making Fruit Salad:**

    1. **Prepare Fruits:**
       - Wash and prepare all the fruits as directed (diced, sliced, quartered, etc.).

    2. **Combine Fruits:**
       - In a mixing bowl, combine the diced apple, sliced banana, quartered strawberries, halved grapes, and diced kiwi.

    3. **Optional Sweetener:**
       - If desired, drizzle honey or maple syrup over the fruit for added sweetness.
       - Gently toss to combine.

    4. **Garnish (Optional):**
       - Garnish the fruit salad with fresh mint leaves for a pop of color and flavor.

    5. **Serve:**
       - Transfer the fruit salad to serving bowls or plates.
       - Enjoy your refreshing and healthy fruit salad as a snack or dessert!

    Tips:
    - Feel free to customize your fruit salad by adding your favorite fruits or omitting any fruits you don't like.
    - For a tropical twist, you can add fruits like mango, pineapple, or papaya.

    This simple and delicious fruit salad is a great way to enjoy fresh fruits and satisfy your sweet cravings!
    """.trimIndent()
        ),
        FoodItem(
            "Microwave Mug Brownie",
            R.drawable.mug_brownie,
            "Snack/Dessert",
            listOf("4 tablespoons all-purpose flour", "4 tablespoons granulated sugar", "2 tablespoons unsweetened cocoa powder", "2 tablespoons vegetable oil", "3 tablespoons milk", "1/4 teaspoon vanilla extract", "Pinch of salt"),
            listOf("Optional: chocolate chips, chopped nuts, or whipped cream for topping"),
            listOf("Microwave-safe mug", "Measuring spoons", "Mixing spoon"),
            """
    **Instructions for making Microwave Mug Brownie:**

    1. **Prepare Mug:**
       - Lightly grease a microwave-safe mug with cooking spray or butter.

    2. **Mix Dry Ingredients:**
       - In the mug, combine flour, sugar, cocoa powder, and a pinch of salt. Mix well with a fork or spoon.

    3. **Add Wet Ingredients:**
       - Add vegetable oil, milk, and vanilla extract to the mug. Stir until smooth and well combined.

    4. **Optional Toppings:**
       - If desired, sprinkle chocolate chips or chopped nuts on top of the brownie batter.

    5. **Microwave:**
       - Microwave the mug brownie on high for 1-2 minutes, or until the brownie is set but still slightly gooey in the center. Cooking time may vary depending on your microwave's wattage.

    6. **Cool and Enjoy:**
       - Allow the mug brownie to cool for a minute or two before enjoying it straight from the mug or transferring it to a plate.
       - Optional: Top with whipped cream or additional toppings of your choice.

    Enjoy your quick and delicious Microwave Mug Brownie!
    """.trimIndent()
        ),
        FoodItem(
            "No-Bake Peanut Butter Oatmeal Cookies",
            R.drawable.no_bake_cookies,
            "Snack/Dessert",
            listOf(
                "1/2 cup granulated sugar",
                "1/2 cup packed brown sugar",
                "1/2 cup unsalted butter",
                "1/2 cup milk",
                "1 cup creamy peanut butter",
                "3 cups quick-cooking oats",
                "1 teaspoon vanilla extract",
                "Pinch of salt"
            ),
            listOf(
                "Optional: 1/4 cup chocolate chips or chopped nuts"
            ),
            listOf(
                "Large saucepan",
                "Mixing spoon",
                "Wax paper or parchment paper"
            ),
            """
    **Instructions for making No-Bake Peanut Butter Oatmeal Cookies:**

    1. **Prepare Ingredients:**
       - Measure out all the ingredients and set them aside.

    2. **Combine Sugar and Butter:**
       - In a large saucepan over medium heat, combine granulated sugar, brown sugar, butter, and milk. Stir until the mixture comes to a rolling boil.

    3. **Add Peanut Butter:**
       - Remove the saucepan from heat and stir in the peanut butter until melted and well combined.

    4. **Add Remaining Ingredients:**
       - Stir in the quick-cooking oats, vanilla extract, and a pinch of salt, mixing until the mixture is smooth and all ingredients are evenly incorporated.

    5. **Form Cookies:**
       - Drop spoonfuls of the cookie mixture onto wax paper or parchment paper, spacing them about 2 inches apart.

    6. **Optional Toppings:**
       - If desired, sprinkle chocolate chips or chopped nuts on top of the cookies before they set.

    7. **Cool and Set:**
       - Allow the cookies to cool and set at room temperature for about 30 minutes to 1 hour, or until firm.

    8. **Enjoy:**
       - Once set, your No-Bake Peanut Butter Oatmeal Cookies are ready to enjoy!

    These cookies are quick, easy, and require no baking, making them a perfect dessert for busy college students!
    """.trimIndent()
        ),
        FoodItem(
            "Rice Cake with Peanut Butter and Banana Slices",
            R.drawable.rice_cake_peanut_butter_banana,
            "Snack/Dessert",
            listOf(
                "1 rice cake",
                "2 tablespoons peanut butter (smooth or crunchy)",
                "1 banana, sliced",
                "Optional: Honey or cinnamon for drizzling"
            ),
            listOf(
                "Knife",
                "Plate"
            ),
            """
    **Instructions for making Rice Cake with Peanut Butter and Banana Slices:**

    1. **Prepare Ingredients:**
       - Slice the banana into thin rounds.

    2. **Spread Peanut Butter:**
       - Spread peanut butter evenly on top of the rice cake.

    3. **Add Banana Slices:**
       - Arrange the banana slices on top of the peanut butter-covered rice cake.

    4. **Optional Drizzle:**
       - Drizzle a little honey or sprinkle cinnamon over the top for extra flavor, if desired.

    5. **Enjoy:**
       - Your Rice Cake with Peanut Butter and Banana Slices is ready to eat! Serve immediately as a satisfying and energy-boosting snack.

    This snack is quick to make, portable, and provides a good balance of carbohydrates, protein, and healthy fats, making it an ideal choice for busy college students!
    """.trimIndent()
        ),
        FoodItem(
            "Rice Cake with Peanut Butter and Banana Slices",
            R.drawable.rice_cake_peanut_butter_banana,
            "Snack/Dessert",
            listOf(
                "1 rice cake",
                "2 tablespoons peanut butter (smooth or crunchy)",
                "1 banana, sliced",
                "Optional: Honey or cinnamon for drizzling"
            ),
            listOf(
                "Knife",
                "Plate"
            ),
            """
    **Instructions for making Rice Cake with Peanut Butter and Banana Slices:**

    1. **Prepare Ingredients:**
       - Slice the banana into thin rounds.

    2. **Spread Peanut Butter:**
       - Spread peanut butter evenly on top of the rice cake.

    3. **Add Banana Slices:**
       - Arrange the banana slices on top of the peanut butter-covered rice cake.

    4. **Optional Drizzle:**
       - Drizzle a little honey or sprinkle cinnamon over the top for extra flavor, if desired.

    5. **Enjoy:**
       - Your Rice Cake with Peanut Butter and Banana Slices is ready to eat! Serve immediately as a satisfying and energy-boosting snack.

    This snack is quick to make, portable, and provides a good balance of carbohydrates, protein, and healthy fats, making it an ideal choice for busy college students!
    """.trimIndent()
        ),
        FoodItem(
            "Hummus and Veggie Sticks",
            R.drawable.hummus_veggie_sticks,
            "Snack/Dessert",
            listOf(
                "1/2 cup hummus (store-bought or homemade)",
                "1 carrot, cut into sticks",
                "1 cucumber, cut into sticks",
                "1 bell pepper (any color), cut into strips",
                "Optional: Celery sticks, cherry tomatoes, or snap peas for dipping"
            ),
            listOf(
                "Knife",
                "Cutting board",
                "Bowl",
                "Plate"
            ),
            """
    **Instructions for making Hummus and Veggie Sticks:**

    1. **Prepare Veggies:**
       - Wash and cut the carrot, cucumber, and bell pepper into sticks or strips.

    2. **Serve Hummus:**
       - Spoon the hummus into a bowl and place it on a serving plate.

    3. **Arrange Veggie Sticks:**
       - Arrange the carrot, cucumber, and bell pepper sticks around the bowl of hummus on the plate.

    4. **Optional Veggies:**
       - Add celery sticks, cherry tomatoes, or snap peas to the plate for additional dipping options.

    5. **Enjoy:**
       - Your Hummus and Veggie Sticks are ready to enjoy! Dip the veggie sticks in the hummus for a healthy and satisfying snack.

    Hummus and Veggie Sticks are a nutritious and delicious snack that's easy to prepare, portable, and perfect for busy college students on the go!
    """.trimIndent()
        ),
        FoodItem(
            "Cheese and Crackers",
            R.drawable.cheese_crackers,
            "Snack/Dessert",
            listOf(
                "4-6 whole grain crackers",
                "1-2 slices of cheese (Cheddar, Swiss, or your favorite)",
                "Optional: Sliced apple or grapes for pairing"
            ),
            listOf(
                "Plate",
                "Knife"
            ),
            """
    **Instructions for making Cheese and Crackers:**

    1. **Prepare Cheese and Crackers:**
       - Place the whole grain crackers on a plate.

    2. **Slice Cheese:**
       - Cut the cheese slices into bite-sized pieces or strips.

    3. **Arrange Cheese on Crackers:**
       - Place the cheese pieces or strips on top of the crackers.

    4. **Optional Fruit Pairing:**
       - If desired, serve sliced apple or grapes alongside the cheese and crackers for a balanced and tasty snack.

    5. **Enjoy:**
       - Your Cheese and Crackers snack is ready to enjoy! Serve immediately and enjoy the combination of crunchy crackers and creamy cheese.

    Cheese and Crackers are a classic snack that's quick to assemble, satisfying, and provides a good balance of carbohydrates, protein, and fats, making it an ideal choice for busy college students!
    """.trimIndent()
        ),
        FoodItem(
            "Yogurt with Granola and Fresh Berries",
            R.drawable.yogurt_granola_berries,
            "Snack/Dessert",
            listOf(
                "1 cup plain or flavored yogurt",
                "1/4 cup granola",
                "1/2 cup mixed fresh berries (strawberries, blueberries, raspberries)",
                "Optional: Drizzle of honey or maple syrup"
            ),
            listOf(
                "Bowl",
                "Spoon"
            ),
            """
    **Instructions for making Yogurt with Granola and Fresh Berries:**

    1. **Prepare Yogurt:**
       - Spoon the yogurt into a bowl.

    2. **Add Granola:**
       - Sprinkle the granola evenly over the yogurt.

    3. **Top with Fresh Berries:**
       - Arrange the mixed fresh berries on top of the granola and yogurt.

    4. **Optional Sweetener:**
       - If desired, drizzle a little honey or maple syrup over the top for added sweetness.

    5. **Enjoy:**
       - Your Yogurt with Granola and Fresh Berries snack is ready to enjoy! Mix everything together and savor the delicious combination of creamy yogurt, crunchy granola, and sweet-tart berries.

    This snack is quick to assemble, nutritious, and offers a good balance of protein, carbohydrates, and antioxidants, making it an ideal choice for busy college students!
    """.trimIndent()
        ),




    )
}
