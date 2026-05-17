package com.example.laba2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }
    fun signin(view: View) {
        if (email.text.isNotEmpty() && password.text.isNotEmpty()) {
            startActivity(Intent(this, MenuActivity::class.java))
        } else {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
        }
    }
}