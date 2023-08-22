package com.example.demo.learning.recycler_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = listOf("Priyank", "Raj", "Alisha", "Karan", "Natasha", "Arjun", "Sneha", "Rohit", "Meera", "Vikram", "Neha", "Sameer", "Anita", "Ravi", "Pooja", "Aditya", "Kavita", "Yash", "Nisha", "Deepak")
    val recyclerView : RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.adapter = ItemAdapter(itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}