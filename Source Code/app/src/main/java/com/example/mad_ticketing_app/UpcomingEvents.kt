package com.example.mad_ticketing_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class UpcomingEvents : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_events)

        // Initialize the BottomNavigationView
        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        // Set the selected item ID to the current page
        bottomNavigationView.selectedItemId = R.id.events

        // Set up the navigation listener
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.events -> {
                    true
                }

                R.id.home -> {
                    val intent = Intent(this, user_bookings::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
                    true
                }

                R.id.favorites -> {
                    val intent = Intent(this, favorite_events::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    true
                }

                else -> false
            }
        }
    }
}