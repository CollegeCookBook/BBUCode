package com.example.collegecookbbookapp

import android.os.Parcel
import android.os.Parcelable

data class FoodItem(
    val name: String,
    val image: Int,
    val category: String,
    val mainIngredients: List<String>,
    val optionalIngredients: List<String>,
    val requirements: List<String>,
    val instructions: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.createStringArrayList() ?: emptyList(),
        parcel.createStringArrayList() ?: emptyList(),
        parcel.createStringArrayList() ?: emptyList(),
        parcel.readString() ?: ""
    )

    // Calculate estimated price based on mainIngredients and optionalIngredients
    fun calculateEstimatedPrice(): Double {
        val allIngredients = mainIngredients + optionalIngredients
        return allIngredients.sumByDouble { ingredient ->
            ingredientPrices[ingredient.toLowerCase()] ?: 0.0
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(image)
        parcel.writeString(category)
        parcel.writeStringList(mainIngredients)
        parcel.writeStringList(optionalIngredients)
        parcel.writeStringList(requirements)
        parcel.writeString(instructions)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FoodItem> {
        override fun createFromParcel(parcel: Parcel): FoodItem {
            return FoodItem(parcel)
        }

        override fun newArray(size: Int): Array<FoodItem?> {
            return arrayOfNulls(size)
        }

        // Map containing ingredient prices
        private val ingredientPrices = mapOf(
            "flour" to 2.50,          // in dollars
            "sugar" to 3.00,          // in dollars
            "large eggs" to 5.60,     // a dozen
            "eggs" to 4.96,           // a dozen
            "milk" to 3.15,           // in dollars
            "butter" to 4.00,         // in dollars
            "chicken breast" to 6.00,  // in dollars per pound
            "chicken thighs" to 3.50,  // in dollars per pound
            "pork chops" to 5.00,      // in dollars per pound
            "pork loin" to 4.50,       // in dollars per pound
            "ground beef" to 5.00,     // in dollars per pound
            "beef steak" to 8.00,      // in dollars per pound
            "ramen noodles" to 0.50,   // each
            "rice" to 1.00,            // in dollars per pound
            "pasta" to 1.00,           // in dollars per pound
            "bread" to 3.00,           // in dollars per loaf
            "cheese" to 3.50,          // in dollars per pound
            "yogurt" to 2.00,          // in dollars per container
            "potatoes" to 0.50,        // in dollars per pound
            "bananas" to 0.30,         // per pound
            "apples" to 1.00,          // per pound
            "peanut butter" to 3.50,    // in dollars per jar
            "jelly" to 2.50,           // in dollars per jar
            "canned tuna" to 1.50,      // in dollars per can
            "instant noodles" to 0.75,  // per pack
            "onions" to 0.50,           // in dollars per pound
            "carrots" to 0.60,          // in dollars per pound
            "tomatoes" to 1.00,         // in dollars per pound
            "lettuce" to 1.50,          // per head
            "bell peppers" to 1.00,     // each
            "olive oil" to 5.00,        // in dollars per bottle
            "vinegar" to 2.00,          // in dollars per bottle
            "spaghetti sauce" to 3.00,  // in dollars per jar
            "spaghetti" to 2.00         //
            "cereal" to 4.00,           // in dollars per box
            "muesli" to 5.00,           // in dollars per bag
            "oatmeal" to 3.50,          // in dollars per container
            "cookies" to 2.50,          // in dollars per pack
            "chips" to 2.00,            // in dollars per bag
            "soda" to 1.00,             // per can
            "juice" to 2.50,            // in dollars per bottle
            "coffee" to 6.00,           // in dollars per bag
            "tea" to 4.00,              // in dollars per box
            "water" to 1.00,            // per bottle
            "muffins" to 1.50,          // each
            "frozen vegetables" to 2.50, // in dollars per bag
            "ice cream" to 4.00,        // in dollars per pint
            "chocolate" to 3.00,        // in dollars per bar
            "popcorn" to 1.00,          // in dollars per bag
            "peanuts" to 2.00,          // in dollars per bag
            "trail mix" to 3.50,        // in dollars per bag
            "chocolate milk" to 2.00,   // in dollars per bottle
            "granola bars" to 3.00,     // in dollars per box
            "salad dressing" to 2.50,   // in dollars per bottle
            "mayonnaise" to 3.00,       // in dollars per jar
            "ketchup" to 2.00,          // in dollars per bottle
            "mustard" to 1.50,          // in dollars per bottle
            "salsa" to 2.50,            // in dollars per jar
            "tortilla chips" to 2.00,   // in dollars per bag // per pack
            "frozen pizza" to 5.00,     // each
            "frozen meals" to 4.00,     // in dollars per meal
            "frozen fries" to 3.00,     // in dollars per bag
            "frozen chicken nuggets" to 4.00, // in dollars per bag
            "frozen fish fillets" to 6.00,     // in dollars per pack
            "frozen vegetables" to 2.50,        // in dollars per bag
            "energy drinks" to 2.50,    // per can
            "protein bars" to 2.50,     // in dollars per bar
            "yogurt parfait" to 3.00,    // each
            "wraps" to 2.00,            // each
            "sandwiches" to 4.00,       // each
            "pancakes" to 3.00,         // per serving
            "waffles" to 2.50,          // per serving
            "frozen berries" to 4.50,    // in dollars per bag
            "frozen fruit" to 3.50,      // in dollars per bag
            "frozen yogurt" to 5.00,     // in dollars per container
            "chicken wings" to 5.00,     // in dollars per pound
            "hot dogs" to 2.50,          // per pack
            "sausages" to 4.00,          // per pack
            "bacon" to 5.00,             // in dollars per pack
            "salami" to 6.00,            // in dollars per pack
            "ham" to 7.00,               // in dollars per pound
            "turkey" to 8.00,            // in dollars per pound
            "tofu" to 2.50,              // in dollars per block
            "soy milk" to 2.50,          // in dollars per container
            "almond milk" to 3.00,       // in dollars per container
            "coconut milk" to 2.50,      // in dollars per can
            "hummus" to 3.50,            // in dollars per container
            "chips and salsa" to 4.50,   // per set
            "quesadillas" to 3.50,       // each
            "taco shells" to 3.00,             // per serving
            "burritos" to 4.00,           // each
            "peas" to 1.00,                  // in dollars per pound
            "corn" to 0.75,                  // in dollars per can
            "zucchini" to 0.75,              // in dollars per pound
            "cabbage" to 0.50,               // in dollars per pound
            "broccoli" to 1.00,              // in dollars per pound
            "cauliflower" to 1.50,           // in dollars per pound
            "spinach" to 1.50,               // in dollars per pound
            "kale" to 1.50,                  // in dollars per bunch
            "lemons" to 0.50,                // each
            "limes" to 0.30,                 // each
            "oranges" to 0.70,               // each
            "grapes" to 2.00,                // in dollars per pound
            "strawberries" to 2.50,          // in dollars per pound
            "blueberries" to 3.00,           // in dollars per pound
            "raspberries" to 3.50,           // in dollars per pound
            "blackberries" to 3.00,          // in dollars per pound
            "watermelon" to 0.30,            // per pound
            "cantaloupe" to 0.50,            // per pound
            "honeydew melon" to 0.50,        // per pound
            "kiwi" to 0.50,                  // each
            "mango" to 1.00,                 // each
            "pineapple" to 2.50,             // each
            "peaches" to 1.50,               // in dollars per pound
            "plums" to 1.00,                 // in dollars per pound
            "nectarines" to 1.50,            // in dollars per pound
            "avocado" to 1.00,               // each
            "garlic" to 0.50,                // per bulb
            "ginger" to 0.75,                // per pound
            "onion powder" to 2.00,           // in dollars per jar
            "garlic powder" to 2.00,          // in dollars per jar
            "paprika" to 1.50,               // in dollars per jar
            "cinnamon" to 1.50,              // in dollars per jar
            "nutmeg" to 2.00,                // in dollars per jar
            "basil" to 1.50,                 // in dollars per bunch
            "thyme" to 1.50,                 // in dollars per bunch
            "rosemary" to 1.50,              // in dollars per bunch
            "oregano" to 1.50,               // in dollars per bunch
            "parsley" to 1.00,               // in dollars per bunch
            "cilantro" to 0.75,              // in dollars per bunch
            "mint" to 1.00,                  // in dollars per bunch
            "dill" to 1.50,                  // in dollars per bunch
            "chives" to 1.00,                // in dollars per bunch
            "bay leaves" to 1.50,             // in dollars per jar
            "cumin" to 2.00,                 // in dollars per jar
            "coriander" to 2.00,             // in dollars per jar
            "turmeric" to 2.50,              // in dollars per jar
            "vanilla extract" to 4.00,        // in dollars per bottle
            "almond extract" to 4.00,         // in dollars per bottle
            "coconut oil" to 5.00,            // in dollars per jar
            "canola oil" to 3.00,             // in dollars per bottle
            "peanut oil" to 4.00,             // in dollars per bottle
            "sunflower oil" to 3.50,          // in dollars per bottle
            "sesame oil" to 6.00,             // in dollars per bottle
            "balsamic vinegar" to 5.00,       // in dollars per bottle
            "red wine vinegar" to 3.50,       // in dollars per bottle
            "white wine vinegar" to 3.50,      // in dollars per bottle
            "apple cider vinegar" to 3.00,     // in dollars per bottle
            "soy sauce" to 2.50,               // in dollars per bottle
            "teriyaki sauce" to 3.00,          // in dollars per bottle
            "hoisin sauce" to 3.50,            // in dollars per bottle
            "sriracha" to 3.00,                // in dollars per bottle
            "bbq sauce" to 3.00,               // in dollars per bottle
            "sour cream" to 2.00,              // in dollars per container
            "cream cheese" to 2.50,            // in dollars per pack
            "cottage cheese" to 3.00,          // in dollars per container
            "feta cheese" to 4.00,              // in dollars per pack
            "mozzarella cheese" to 3.50,        // in dollars per pack
            "cheddar cheese" to 3.50,           // in dollars per pack
            "parmesan cheese" to 4.00,          // in dollars per pack
            "gouda cheese" to 4.00,              // in dollars per pack
            "swiss cheese" to 4.00,              // in dollars per pack
            "yogurt" to 2.00,                    // in dollars per container
            "kefir" to 3.50,                      // in dollars per bottle
            "sour cream" to 2.00,                 // in dollars per container
            "cottage cheese" to 3.00,             // in dollars per container
            "cream" to 2.50,                      // in dollars per container
            "butter" to 4.00,                     // in dollars per pack
            "eggs" to 0.20,                       // each
            "bread" to 2.00,                      // in dollars per loaf
            "tortillas" to 1.50,                  // per pack
            "bagels" to 3.00,                     // per pack
            "English muffins" to 2.50,            // per pack
            "croissants" to 1.50,                 // each
            "donuts" to 1.00,                     // each
            "pita bread" to 2.00,                 // per pack
            "rolls" to 1.50,                      // per pack
            "crackers" to 2.00,                   // per pack
            "pretzels" to 1.50,                   // per pack
            "cheese" to 3.50,                     // in dollars per pound
            "ham" to 7.00,                        // in dollars per pound
            "turkey" to 8.00,                     // in dollars per pound
            "bacon" to 5.00,                      // in dollars per pack
            "salami" to 6.00,                     // in dollars per pack
            "chicken breast" to 6.00,             // in dollars per pound
            "pepperoni" to 5.00,                  // in dollars per pack
            "sausage" to 4.00,                    // in dollars per pack
            "anchovies" to 3.50,                  // in dollars per pack
            "mushrooms" to 2.50,                  // in dollars per pack
            "bell peppers" to 1.00,               // each
            "onions" to 0.50,                     // in dollars per pound
            "tomatoes" to 1.00,                   // in dollars per pound
            "lettuce" to 1.50,                    // per head
            "olives" to 2.50,                     // in dollars per pack
            "pickles" to 2.00,                    // in dollars per jar
            "jalapenos" to 1.00,                  // in dollars per jar
            "sauerkraut" to 2.50,                 // in dollars per jar
            "artichokes" to 3.00,                 // each
            "basil" to 1.50,                      // in dollars per bunch
            "oregano" to 1.50,                    // in dollars per bunch
            "thyme" to 1.50,                      // in dollars per bunch
            "rosemary" to 1.50,                   // in dollars per bunch
            "sage" to 1.50,                       // in dollars per bunch
            "bay leaves" to 1.50,                  // in dollars per jar
            "salt" to 1.00,                        // per bag
            "pepper" to 1.50,                      // per jar
            "olive oil" to 5.00,                   // in dollars per bottle
            "vinegar" to 2.00,                     // in dollars per bottle
            "mayonnaise" to 3.00,                  // in dollars per jar
            "mustard" to 1.50,                     // in dollars per bottle
            "ketchup" to 2.00,                     // in dollars per bottle
            "bbq sauce" to 3.00,                   // in dollars per bottle
            "pizza sauce" to 3.00,                 // in dollars per jar
            "pasta sauce" to 2.50,                 // in dollars per jar
            "salsa" to 2.50,                       // in dollars per jar
            "guacamole" to 4.00,                   // in dollars per container
            "cream cheese" to 2.50,                // in dollars per pack
            "peanut butter" to 3.50,               // in dollars per jar
            "jelly" to 2.50,                       // in dollars per jar
            "honey" to 4.00,                       // in dollars per jar
            "nutella" to 5.00,                     // in dollars per jar
            "chocolate chips" to 3.00,             // in dollars per bag
            "marshmallows" to 1.00,                // per bag
            "graham crackers" to 2.50,             // per pack
            "ice cream" to 4.00,                   // in dollars per pint
            "frozen pizza" to 5.00,                // each
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen waffles" to 2.50,              // per pack
            "frozen pancakes" to 3.00,             // per pack
            "frozen burritos" to 4.00,             // in dollars per pack
            "frozen dinners" to 4.00,              // in dollars per pack
            "frozen fries" to 3.00,                // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen waffles" to 2.50,              // per pack
            "frozen pancakes" to 3.00,             // per pack
            "frozen burritos" to 4.00,             // in dollars per pack
            "frozen dinners" to 4.00,              // in dollars per pack
            "frozen fries" to 3.00,                // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00,          // in dollars per bag
            "frozen vegetables" to 2.50,           // in dollars per bag
            "frozen fruit" to 3.50,                // in dollars per bag
            "frozen berries" to 4.50,              // in dollars per bag
            "frozen chicken nuggets" to 4.00,      // in dollars per bag
            "frozen fish sticks" to 5.00
        )
    }
}
