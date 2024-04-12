package com.example.collegecookbbookapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (loginTracker.getLoggedIn() == true) {
            setContentView(R.layout.activity_homepage)
            val fragmentManager: FragmentManager = supportFragmentManager
            val recipeFragment: Fragment = RecipeFragment()
            val cookwareFragment: Fragment = ApplianceFragment()

            val navigationBar = findViewById<BottomNavigationView>(R.id.btmNavBar)
            navigationBar.setOnNavigationItemSelectedListener { item ->
                lateinit var fragment: Fragment
                when (item.itemId) {
                    R.id.recipe_tab -> fragment = recipeFragment
                    R.id.appliance_tab -> fragment = cookwareFragment
                }
                fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit()
                true
            }
            navigationBar.selectedItemId = R.id.recipe_tab
        } else {
            setContentView(R.layout.start_menu)
            val loginBtn = findViewById<Button>(R.id.login_button)
            val signupBtn = findViewById<Button>(R.id.register_button)
            loginBtn.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }

            signupBtn.setOnClickListener {
                val intent = Intent(this, SignupActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
