package com.utcc.momandkit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class addchild extends AppCompatActivity {

    private TextView birthday;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    EditText weight;
    EditText height;
    EditText head;
    EditText in_name, old;
    Spinner sex,bloodGroup;

    double numwei,numhei, numhead ;
    Button next,add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addchild);

        birthday = findViewById(R.id.edt_hbd);


        in_name = findViewById(R.id.edt_name);
        old = findViewById(R.id.edt_old);


        weight=findViewById(R.id.edt_weight);
        height=findViewById(R.id.edt_height);
        head=findViewById(R.id.edt_head);




        add = findViewById(R.id.btn_2);
        next = findViewById(R.id.btn_1);

        ImageView image = (ImageView) findViewById(R.id.imageView2);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(addchild.this, MainActivity.class);
                startActivity(i);
            }
        });


        birthday.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        addchild.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String date = day + "/" + month + "/" + year;
                birthday.setText(date);
            }
        };

        sex = findViewById(R.id.spn_sex);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(addchild.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sex));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sex.setAdapter(myAdapter1);

        bloodGroup = findViewById(R.id.spn_blood);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(addchild.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.blood));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bloodGroup.setAdapter(myAdapter2);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view ){

                String umname = in_name.getText().toString();
                String bird = birthday.getText().toString();
                String sex_= sex.getSelectedItem().toString();
                String old_= old.getText().toString();
                String BG= bloodGroup.getSelectedItem().toString();
                numwei=Double.parseDouble(weight.getText().toString());
                numhei=Double.parseDouble(height.getText().toString());
                numhead=Double.parseDouble(head.getText().toString());




                String message1 = Double.toString(numwei);
                String message2 = Double.toString(numhei);
                String message3 = Double.toString(numhead);



                Intent i = new Intent(addchild.this, month1_2.class);
                i.putExtra("umname",umname);
                i.putExtra("bird",bird);
                i.putExtra("sex_",sex_);
                i.putExtra("old_",old_);
                i.putExtra("BG",BG);
                i.putExtra("message1",message1);
                i.putExtra("message2",message2);
                i.putExtra("message3",message3);

                startActivity(i);


                MyDatabaseHelper myDB = new MyDatabaseHelper(addchild.this);
                myDB.addchild(in_name.getText().toString().trim(),
                        birthday.getText().toString().trim(),
                        sex.getSelectedItem().toString().trim(),
                        old.getText().toString().trim(),
                        bloodGroup.getSelectedItem().toString().trim(),
                        weight.getText().toString().trim(),
                        height.getText().toString().trim(),
                        head.getText().toString().trim());





            }
        });


    }


}


