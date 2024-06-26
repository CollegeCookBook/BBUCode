package com.example.collegecookbbookapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView

class FoodListAdapter(
    private var foodList: List<FoodItem>,
    private val fragmentManager: FragmentManager,
    private val onItemClick: (FoodItem) -> Unit
) : RecyclerView.Adapter<FoodListAdapter.FoodViewHolder>() {

    private var filteredList: List<FoodItem> = foodList
    private var budget: Double? = null

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodImage: ImageView = itemView.findViewById(R.id.food_image)
        val foodName: TextView = itemView.findViewById(R.id.food_name)
        val foodPrice: TextView = itemView.findViewById(R.id.food_price)
        val foodIngredients: TextView = itemView.findViewById(R.id.food_ingredients) // Add this line
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(itemView)
    }

    fun updateList(newList: List<FoodItem>) {
        filteredList = newList
        applyBudgetFilter()
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentItem = filteredList[position]
        holder.foodImage.setImageResource(currentItem.image)
        holder.foodName.text = currentItem.name

        // Calculate and display estimated price
        val estimatedPrice = currentItem.calculateEstimatedPrice()
        holder.foodPrice.text = String.format("$%.2f", estimatedPrice)

        // Display ingredients
        holder.foodIngredients.text = currentItem.mainIngredients.joinToString(", ")

        holder.itemView.setOnClickListener {
            onItemClick(currentItem)
        }
    }

    override fun getItemCount() = filteredList.size

    fun filterByCategory(category: String) {
        if (category == "All") {
            filteredList = foodList
        } else {
            filteredList = foodList.filter { it.category == category }
        }
        applyBudgetFilter()
        notifyDataSetChanged()
    }

    fun setBudget(budget: Double?) {
        this.budget = budget
        applyBudgetFilter()
        notifyDataSetChanged()
    }

    private fun applyBudgetFilter() {
        budget?.let { budgetValue ->
            filteredList = if (budgetValue >= 50) {
                foodList.filter { it.calculateEstimatedPrice() >= budgetValue }
            } else {
                foodList.filter { it.calculateEstimatedPrice() <= budgetValue }
            }
        }
    }

    fun navigateToFoodDetail(foodItem: FoodItem? = null) {
        val bundle = Bundle()
        foodItem?.let { bundle.putParcelable("foodItem", it) }

        val foodDetailFragment = FoodDetailFragment()
        foodDetailFragment.arguments = bundle

        fragmentManager.beginTransaction()
            .replace(R.id.frame_layout, foodDetailFragment)
            .addToBackStack(null)
            .commit()
    }
}
