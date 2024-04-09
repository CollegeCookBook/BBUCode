package com.example.collegecookbbookapp

import android.widget.*
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupButton = findViewById<Button>(R.id.signupButton)
        val usernamesignupEditText = findViewById<EditText>(R.id.usernamesignupEditText)
        val emailsignupEditText = findViewById<EditText>(R.id.emailsignupEditText)
        val passwordsignupEditText = findViewById<EditText>(R.id.passwordsignupEditText)

        signupButton.setOnClickListener {
            // Dummy signup logic (replace with your actual login logic)
            val username = usernamesignupEditText.text.toString()
            val email = emailsignupEditText.text.toString()
            val password = passwordsignupEditText.text.toString()

            navigateToHome()
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomepageActivity::class.java)
        startActivity(intent)
        finish()
    }
}

