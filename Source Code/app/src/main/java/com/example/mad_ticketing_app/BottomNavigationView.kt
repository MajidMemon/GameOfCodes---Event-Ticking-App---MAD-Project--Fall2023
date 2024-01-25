package com.example.mad_ticketing_app

import android.app.Activity
import android.content.Intent
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.mad_ticketing_app.R

class BottomNavigationView {
    companion object {
        fun setupBottomNavigation(activity: Activity, bottomNavigationView: BottomNavigationView) {
            bottomNavigationView.setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.home -> {
                        if (activity !is MainActivity) {
                            val intent = Intent(activity, MainActivity::class.java)
                            activity.startActivity(intent)
                            activity.overridePendingTransition(0, 0)
                        }
                        true
                    }

                    R.id.events -> {
                        if (activity !is UserEvents) {
                            val intent = Intent(activity, UserEvents::class.java)
                            activity.startActivity(intent)
                            activity.overridePendingTransition(0, 0)
                        }
                        true
                    }

                    R.id.favorites -> {
                        if (activity !is favorite_events) {
                            val intent = Intent(activity, favorite_events::class.java)
                            activity.startActivity(intent)
                            activity.overridePendingTransition(0, 0)
                        }
                        true
                    }

                    else -> false
                }
            }
        }

        fun setSelectedItem(bottomNavigationView: BottomNavigationView, itemId: Int) {
            bottomNavigationView.selectedItemId = itemId
        }

        fun setOnNavigationItemSelectedListener(
            bottomNavigationView: BottomNavigationView,
            onNavItemSelected: (MenuItem) -> Boolean
        ) {
            bottomNavigationView.setOnNavigationItemSelectedListener { item ->
                onNavItemSelected(item)
            }
        }
    }
}