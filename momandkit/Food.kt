package com.utcc.momandkit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.foodtest)

        val btnBackToMain: ImageButton = findViewById(R.id.btnback)

        btnBackToMain.setOnClickListener {
            val intentToVaccine = Intent(this@Food,MainActivity::class.java)
            startActivity(intentToVaccine)
        }

        val buttonGoToFood1 = findViewById<ImageButton>(R.id.btn_food1)

        buttonGoToFood1.setOnClickListener {
            val intentToFood1 = Intent(this@Food, food1::class.java)

            startActivity(intentToFood1)
        }

        val buttonGoToFood2 = findViewById<ImageButton>(R.id.btn_food2)

        buttonGoToFood2.setOnClickListener {
            val intentToFood2 = Intent(this@Food, food2::class.java)

            startActivity(intentToFood2)
        }

        val buttonGoToFood3 = findViewById<ImageButton>(R.id.btn_food3)

        buttonGoToFood3.setOnClickListener {
            val intentToFood3 = Intent(this@Food, food3::class.java)

            startActivity(intentToFood3)
        }

        val buttonGoToFood4 = findViewById<ImageButton>(R.id.btn_food4)

        buttonGoToFood4.setOnClickListener {
            val intentToFood4 = Intent(this@Food, food4::class.java)

            startActivity(intentToFood4)
        }

        val buttonGoToFood5 = findViewById<ImageButton>(R.id.btn_food5)

        buttonGoToFood5.setOnClickListener {
            val intentToFood5 = Intent(this@Food, food5::class.java)

            startActivity(intentToFood5)

        }

        val buttonGoToFood6 = findViewById<ImageButton>(R.id.btn_food6)

        buttonGoToFood6.setOnClickListener {
            val intentToFood6 = Intent(this@Food, food6::class.java)

            startActivity(intentToFood6)

        }

        val buttonGoToFood7 = findViewById<ImageButton>(R.id.btn_food7)

        buttonGoToFood7.setOnClickListener {
            val intentToFood7 = Intent(this@Food, food7::class.java)

            startActivity(intentToFood7)

        }

        val buttonGoToFood8 = findViewById<ImageButton>(R.id.btn_food8)

        buttonGoToFood8.setOnClickListener {
            val intentToFood8 = Intent(this@Food, food8::class.java)

            startActivity(intentToFood8)

        }

        val buttonGoToFood9 = findViewById<ImageButton>(R.id.btn_food9)

        buttonGoToFood9.setOnClickListener {
            val intentToFood9 = Intent(this@Food, food9::class.java)

            startActivity(intentToFood9)

        }

        val buttonGoToFood10 = findViewById<ImageButton>(R.id.btn_food10)

        buttonGoToFood10.setOnClickListener {
            val intentToFood10 = Intent(this@Food, food10::class.java)

            startActivity(intentToFood10)

        }

        val buttonGoToFood11 = findViewById<ImageButton>(R.id.btn_food11)

        buttonGoToFood11.setOnClickListener {
            val intentToFood11 = Intent(this@Food, food11::class.java)

            startActivity(intentToFood11)

        }

        val buttonGoToFood12 = findViewById<ImageButton>(R.id.btn_food12)

        buttonGoToFood12.setOnClickListener {
            val intentToFood12 = Intent(this@Food, food12::class.java)

            startActivity(intentToFood12)


        }

    }
}