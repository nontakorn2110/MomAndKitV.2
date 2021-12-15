package com.utcc.momandkit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.text.FieldPosition

class MainActivity2 : AppCompatActivity() {

    private var result:TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ageAyears = fileList()

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intentBack = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intentBack)

        }
        val adapter = ArrayAdapter.createFromResource(this, R.array.years, android.R.layout.simple_list_item_1)
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1)
        val spinner: Spinner = findViewById(R.id.spinner2)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view : View?, position: Int, id: Long) {
                val selectItem = parent?.getItemAtPosition(position).toString()
                if(selectItem == "แรกเกิด"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.newBron)
                    txtDes2.text = getText(R.string.newBron_des)
                   // Toast.makeText(this@MainActivity2, R.string.newBron, Toast.LENGTH_SHORT).show()
                }else if(selectItem == "1 เดือน"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.month1_1)
                    txtDes2.text = getText(R.string.month1_2)
                    //Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }else if(selectItem == "2 เดือน"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.month2_1)
                    txtDes2.text = getText(R.string.month2_2)
                   // Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }else if(selectItem == "4 เดือน"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.month4_1)
                    txtDes2.text = getText(R.string.month4_2)
                   // Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }else if(selectItem == "6 เดือน"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.month6_1)
                    txtDes2.text = getText(R.string.month6_2)
                    //Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }else if(selectItem == "9 - 12 เดือน"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.month9_12_1)
                    txtDes2.text = getText(R.string.month9_12_2)
                    //Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }else if(selectItem == "9 - 18 เดือน"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.month9_18_1)
                    txtDes2.text = getText(R.string.month9_18_2)
                    //Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }else if(selectItem == "18 เดือน"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.month18_1)
                    txtDes2.text = getText(R.string.month18_2)
                    //Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }else if(selectItem == "2 - 2.5 ปี"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.years2_2_5_1)
                    txtDes2.text = getText(R.string.years2_2_5_2)
                    //Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }else if(selectItem == "2.5 ปี"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.years2_5_1)
                    txtDes2.text = getText(R.string.years2_5_2)
                   // Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }else if(selectItem == "4 ปี"){
                    val txtDes1 = findViewById<TextView>(R.id.des_1)
                    val txtDes2 = findViewById<TextView>(R.id.des_2)
                    txtDes1.text = getText(R.string.years4_1)
                    txtDes2.text = getText(R.string.years4_2)
                    //Toast.makeText(this@MainActivity2, "You select : ${selectItem}", Toast.LENGTH_SHORT).show()
                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MainActivity2, "No !!!!", Toast.LENGTH_SHORT).show()
            }

        }

    }
}

