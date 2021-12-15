package com.utcc.momandkit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SingAndUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_and_up)

        val btnSignIn: Button = findViewById(R.id.btn_signin)
        val btnSignUp: Button = findViewById(R.id.btn_signup)

        btnSignIn.setOnClickListener {
            val intentToSignIn = Intent(this@SingAndUp,SignIn::class.java)
            startActivity(intentToSignIn)
        }

        btnSignUp.setOnClickListener {
            val intentToSignUp = Intent(this@SingAndUp,SignUp::class.java)
            startActivity(intentToSignUp)
        }

    }
}