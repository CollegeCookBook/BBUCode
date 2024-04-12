package com.example.collegecookbbookapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity



class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btn = findViewById<Button>(R.id.loginButton)
        var signupTextView = findViewById<TextView>(R.id.signupTextView)

        signupTextView.setOnClickListener {
            Log.d("Navigation", "Sign Up Text View Clicked") // Check if this log is printed
            val intent = Intent(this, `SignupActivity`::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {
            Log.d("Navigation", "Login button Clicked")
            // Dummy login logic (replace with your actual login logic)
            var username = findViewById<EditText>(R.id.usernameEditText).text.toString()
            var password = findViewById<EditText>(R.id.passwordEditText).text.toString()
            if (username == "dummy" && password == "password") {
                loginTracker.setloggedIn(true)
                navigateToHome()
            }
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
