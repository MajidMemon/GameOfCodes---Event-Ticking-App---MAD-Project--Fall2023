package com.example.mad_ticketing_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class favorite_events : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_events)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.favorites
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(Intent(this, user_bookings::class.java))
                    true
                }
                R.id.events -> {
                    startActivity(Intent(this, UpcomingEvents::class.java))
                    true
                }
                else -> false
            }
        }

        findViewById<CardView>(R.id.card1)?.setOnClickListener {
            startActivity(Intent(this, open_events::class.java))
        }
    }
}
