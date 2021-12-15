package com.utcc.momandkit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class food1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food1)

        val buttonGoToActivity = findViewById<ImageButton>(R.id.btnback)

        buttonGoToActivity.setOnClickListener {

            val intentToAct = Intent(this@food1, Food::class.java)

            startActivity(intentToAct)
        }
    }
}