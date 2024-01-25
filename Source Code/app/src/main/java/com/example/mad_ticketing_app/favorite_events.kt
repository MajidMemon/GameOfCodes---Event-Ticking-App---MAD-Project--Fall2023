package com.example.mad_ticketing_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


data class FavoriteItem(val imageResource: Int, val eventName: String, val eventCategory: String)
class favorite_events : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_events)

        val recyclerView = findViewById<RecyclerView>(R.id.favoritesRecyclerView)
        val favoriteItems = ArrayList<FavoriteItem>()

        favoriteItems.add(FavoriteItem(R.layout.favorites_card, "Event 1", "Hollywood Movie"))
        // Initialize the RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        // Create the adapter and set it to the RecyclerView
        val adapter = FavoritesAdapter(favoriteItems)
        recyclerView.adapter = adapter
    }
}