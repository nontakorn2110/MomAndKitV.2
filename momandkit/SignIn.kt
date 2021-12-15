package com.utcc.momandkit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.schedulers.Schedulers.io

class SignIn : AppCompatActivity() {

    lateinit var myAPI: Node
    var compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val imgBackToFirstPage: ImageButton = findViewById(R.id.imag_backSignUp1)
        val editEmail: EditText = findViewById(R.id.edt_email)
        val editPassword: EditText = findViewById(R.id.edt_Password)
        val btnSigninToFeed: Button = findViewById(R.id.btn_signinToFeed)

        imgBackToFirstPage.setOnClickListener {
            val intentToHomepage = Intent(this@SignIn,SingAndUp::class.java)
            startActivity(intentToHomepage)
        }

        btnSigninToFeed.setOnClickListener {
            login(editEmail.text.toString(),editPassword.text.toString())
            val intenttoFeed = Intent(this@SignIn,MainActivity::class.java)
            startActivity(intenttoFeed)
        }

    }

    private fun login(email: String, password: String) {
        compositeDisposable.add(myAPI.userLogin(email,password)
            .subscribeOn(io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{ message ->
                if(message.contains("password")){
                    Toast.makeText(this@SignIn, "Login Success!!!", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this@SignIn, "Your email or password have wrong", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }

    override fun onStop() {
        compositeDisposable.clear()
        super.onStop()
    }

    override fun onDestroy() {
        compositeDisposable.clear()
        super.onDestroy()
    }
}