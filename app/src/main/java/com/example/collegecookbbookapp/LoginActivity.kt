package com.example.collegecookbbookapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val signupTextView = findViewById<TextView>(R.id.signupTextView)

        signupTextView.setOnClickListener {
            Log.d("Navigation", "Sign Up Text View Clicked") // Check if this log is printed
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            Log.d("Navigation", "Login button Clicked")
            // Dummy login logic (replace with your actual login logic)
            val username = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (username == "dummy" && password == "password") {
                navigateToHome()
            }
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomepageActivity::class.java)
        startActivity(intent)
    }
}
