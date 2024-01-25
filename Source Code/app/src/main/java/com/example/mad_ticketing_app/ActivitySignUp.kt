package com.example.mad_ticketing_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivitySignUp : AppCompatActivity() {

    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialize your views
        passwordEditText = findViewById(R.id.edPassword)
        confirmPasswordEditText = findViewById(R.id.edConPassword)
        signUpButton = findViewById(R.id.signUpBtn)

        // Set up the listener for the sign-up button click
        signUpButton.setOnClickListener {
            signUp()
        }
    }

    private fun signUp() {
        val password = passwordEditText.text.toString()
        val confirmPassword = confirmPasswordEditText.text.toString()

        // Check if the passwords match
        if (password == confirmPassword) {
            // Proceed with the sign-up process
            // This is where you'd include the sign-up logic, maybe sending data to a server
        } else {
            // Show an error message
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            // Optionally, clear the confirm password field
            confirmPasswordEditText.text.clear()
        }
    }
}