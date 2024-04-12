package com.example.collegecookbbookapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodListAdapter(
    private val foodList: List<FoodItem>,
    private val onItemClick: (FoodItem) -> Unit
) : RecyclerView.Adapter<FoodListAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodImage: ImageView = itemView.findViewById(R.id.food_image)
        val foodName: TextView = itemView.findViewById(R.id.food_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentItem = foodList[position]
        holder.foodImage.setImageResource(currentItem.image)
        holder.foodName.text = currentItem.name
        holder.itemView.setOnClickListener {
            onItemClick(currentItem)
        }
    }

    override fun getItemCount() = foodList.size
}
