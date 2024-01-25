package com.example.mad_ticketing_app

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find the TextView by its ID
        val registerTextView: TextView = findViewById(R.id.registerTextView)

        // Set an OnClickListener to it
        registerTextView.setOnClickListener {
            // Intent to start ActivitySignUp
            val signUpIntent = Intent(this, ActivitySignUp::class.java)
            startActivity(signUpIntent)
        }

        val signInBtn: android.widget.Button = findViewById(R.id.signInBtn)
        signInBtn.setOnClickListener {
            // Intent to start UserBookingsActivity
            val intent = Intent(this, user_bookings::class.java)
            startActivity(intent)
    }
}
}
