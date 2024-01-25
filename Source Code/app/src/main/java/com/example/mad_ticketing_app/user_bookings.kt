package com.example.mad_ticketing_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class user_bookings : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_bookings)

        // Initialize the BottomNavigationView
        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        // Set the selected item ID to the current page
        bottomNavigationView.selectedItemId = R.id.home

        // Set up the navigation listener
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    true
                }
                R.id.events -> {
                    val intent = Intent(this, UpcomingEvents::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    true
                }
                R.id.favorites -> {
                    val intent = Intent (this, favorite_events::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    true
                }
                else -> false
            }
        }
        // Find the CardView by its ID
        val eventCardView = findViewById<androidx.cardview.widget.CardView>(R.id.card1)

        // Set OnClickListener on the CardView
        eventCardView.setOnClickListener {
            // Create an Intent to start the OpenEventsActivity
            val intent = Intent(this, EventAdapter::class.java)
            startActivity(intent)
        }
    }
}