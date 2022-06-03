package com.jane.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.TextElementListener
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin:Button
    lateinit var tilEmail:TextInputLayout
    lateinit var etemail:TextInputEditText
    lateinit var tilPassword:TextInputLayout
    lateinit var etpassword:TextInputEditText
    lateinit var tvsignup:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin=findViewById(R.id.btnLogin)
        tilEmail=findViewById(R.id.tilEmail)
        etemail=findViewById(R.id.etemail)
        tilPassword=findViewById(R.id.tilPassword)
        etpassword=findViewById(R.id.etpassword)
        tvsignup=findViewById(R.id.tvsignup)
        tvsignup.setOnClickListener {
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener { validateLogin() }


    }
    fun validateLogin(){
        var error = false
        tilEmail.error = null
        tilPassword.error = null
        var email = etemail.text.toString()
        if (email.isBlank()){
            tilEmail.error = "Email is required"
            error = true
        }
        var password  = etpassword.text.toString()
        if (password.isBlank()){
            tilPassword.error = "Password is required"
            error = true

        }
        if (error!=true){

        }

    }
}