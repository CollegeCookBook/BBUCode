package com.example.collegecookbbookapp

import kotlin.math.log

class loginTracker {
    companion object {
        private var loggedIn = false
        fun setloggedIn(boolean: Boolean) {
            loggedIn = boolean
        }
        fun getLoggedIn(): Boolean{
            return loggedIn
        }
    }
}