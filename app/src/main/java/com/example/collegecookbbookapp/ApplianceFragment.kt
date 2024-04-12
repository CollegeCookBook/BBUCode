package com.example.collegecookbbookapp


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ApplianceFragment : Fragment() {
    private lateinit var applianceAdapter: ApplianceAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_appliance, container, false)
        val appliances = ApplianceDataProvider.appliances // Accessing the list of appliances from ApplianceData
        val recyclerView: RecyclerView = root.findViewById(R.id.applianceRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        applianceAdapter = ApplianceAdapter(appliances)
        recyclerView.adapter = applianceAdapter
        return root
    }
}
