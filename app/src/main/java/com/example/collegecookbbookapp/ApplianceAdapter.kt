package com.example.collegecookbbookapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ApplianceAdapter(private val appliances: List<Appliance>) :
    RecyclerView.Adapter<ApplianceAdapter.ApplianceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApplianceViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_appliance, parent, false)
        return ApplianceViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ApplianceViewHolder, position: Int) {
        val currentAppliance = appliances[position]
        holder.applianceName.text = currentAppliance.name
        holder.appliancePrice.text = currentAppliance.price

        // Load image using Glide library
        Glide.with(holder.itemView)
            .load(currentAppliance.imageUrl)
            .placeholder(R.drawable.profile) // Placeholder image
            .into(holder.applianceImage)
    }

    override fun getItemCount() = appliances.size

    class ApplianceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val applianceImage: ImageView = itemView.findViewById(R.id.appliance_image)
        val applianceName: TextView = itemView.findViewById(R.id.appliance_name)
        val appliancePrice: TextView = itemView.findViewById(R.id.appliance_price)
    }
}
