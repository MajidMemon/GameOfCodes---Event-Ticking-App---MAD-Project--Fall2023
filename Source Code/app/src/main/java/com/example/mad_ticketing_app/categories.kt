package com.example.mad_ticketing_app

import android.R
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout


class categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val filterIcon = findViewById<ImageView>(R.id.filterIcon)

// Assuming drawerLayout is your DrawerLayout

// Assuming drawerLayout is your DrawerLayout
        val drawerLayout = findViewById<DrawerLayout>(R.id.categoriesDrawer)

        filterIcon.setOnClickListener {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }
    }
}