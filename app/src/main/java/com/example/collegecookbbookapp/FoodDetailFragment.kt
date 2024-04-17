package com.example.collegecookbbookapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FoodDetailFragment : Fragment() {

    private lateinit var foodImage: ImageView
    private lateinit var foodName: TextView
    private lateinit var mainIngredients: TextView
    private lateinit var optionalIngredients: TextView
    private lateinit var requirements: TextView
    private lateinit var instructions: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fooddetail, container, false)

        foodImage = view.findViewById(R.id.food_image)
        foodName = view.findViewById(R.id.food_name)
        mainIngredients = view.findViewById(R.id.main_ingredients)
        optionalIngredients = view.findViewById(R.id.optional_ingredients)
        requirements = view.findViewById(R.id.requirements)
        instructions = view.findViewById(R.id.instructions)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val foodItem = arguments?.getParcelable<FoodItem>("foodItem")

        foodItem?.let {
            foodImage.setImageResource(it.image)
            foodName.text = it.name
            mainIngredients.text = it.mainIngredients.joinToString(", ")
            optionalIngredients.text = it.optionalIngredients.joinToString(", ")
            requirements.text = it.requirements.joinToString(", ")
            instructions.text = it.instructions
        }
    }
}
