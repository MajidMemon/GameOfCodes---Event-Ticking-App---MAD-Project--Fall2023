package com.example.mad_ticketing_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class UpcomingEvents : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_bookings)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.events
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(Intent(this, user_bookings::class.java))
                    true
                }
                R.id.favorites -> {
                    startActivity(Intent(this, favorite_events::class.java))
                    true
                }
                else -> false
            }
        }

        // Assuming you have a CardView with id card1 in your layout
        findViewById<CardView>(R.id.card1)?.setOnClickListener {
            startActivity(Intent(this, open_events::class.java))
        }
    }
}
