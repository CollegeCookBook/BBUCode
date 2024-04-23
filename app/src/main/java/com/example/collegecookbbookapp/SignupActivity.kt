package com.example.collegecookbbookapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupButton = findViewById<Button>(R.id.signupButton)


        signupButton.setOnClickListener {
            Log.d("Navigation", "Sign Up button Clicked") // Check if this log is printed
            // Dummy signup logic (replace with your actual login logic)
            var usernamesignupEditText = findViewById<EditText>(R.id.usernamesignupEditText).text.toString()
            var emailsignupEditText = findViewById<EditText>(R.id.emailsignupEditText).text.toString()
            val passwordsignupEditText = findViewById<EditText>(R.id.passwordsignupEditText).text.toString()
            loginTracker.setloggedIn(true)
            navigateToHome()
        }
    }



    private fun navigateToHome() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}