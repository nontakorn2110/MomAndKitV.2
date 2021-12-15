package com.utcc.momandkit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import retrofit2.Retrofit
import io.reactivex.schedulers.Schedulers.io



class SignUp : AppCompatActivity() {

    lateinit var myAPI: Node
    var compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val retrofit: Retrofit = retrofitClient.instance
        myAPI = retrofit.create(Node::class.java)

        val imgBackToFirstPage: ImageButton = findViewById(R.id.imag_backSignUp1)
        val btnNext: Button = findViewById(R.id.btn_ToProfile)
        val editEmail: EditText = findViewById(R.id.edt_email)
        val editPassword: EditText = findViewById(R.id.edt_PasswordSignUp)
        val editUerNameSignUp: EditText = findViewById(R.id.edt_userNameSignup)
        val editEnterPassWord: EditText = findViewById(R.id.edt_enterpassword)

        imgBackToFirstPage.setOnClickListener {
            val intentToHomepage = Intent(this@SignUp,SingAndUp::class.java)
            startActivity(intentToHomepage)
        }

        btnNext.setOnClickListener {
            register(editEmail.text.toString(),editUerNameSignUp.text.toString(),editPassword.text.toString(),editEnterPassWord.text.toString())
            val intentToFeed = Intent(this@SignUp,MainActivity::class.java)
            startActivity(intentToFeed)
        }

    }

    private fun register(
        email: String,
        username: String,
        password: String,
        enterpass: String
    ) {
        compositeDisposable.add(myAPI.registerUser(email, username, password, enterpass)
            .subscribeOn(io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { message ->
                Toast.makeText(this@SignUp, "Register Success !!!", Toast.LENGTH_SHORT).show()
            })


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