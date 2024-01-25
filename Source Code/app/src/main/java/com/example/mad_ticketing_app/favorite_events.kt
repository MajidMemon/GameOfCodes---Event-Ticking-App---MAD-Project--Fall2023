package com.example.mad_ticketing_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.mad_ticketing_app.BottomNavigationView as bn

class favorite_events : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_events)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bn.setupBottomNavigation(this, bottomNavigationView)

        // Set the current menu item as selected
        bn.setSelectedItem(bottomNavigationView, R.id.favorites)

        // Setting up navigation item selection listener
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Navigate to Home
                    val intent = Intent(this, user_bookings::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
                    true
                }

                R.id.events -> {
                    // Navigate to User Events
                    val intent = Intent(this, UpcomingEvents::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
                    true
                }

                R.id.favorites -> {
                    // Current Activity
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
            val intent = Intent(this, open_events::class.java)
            startActivity(intent)
        }
    }
}