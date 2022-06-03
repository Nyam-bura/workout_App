package com.jane.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var btnSignup:Button
    lateinit var tilfirstname:TextInputLayout
    lateinit var etFirstname:TextInputEditText
    lateinit var tilLastName:TextInputLayout
    lateinit var etLastname:TextInputEditText
    lateinit var tileMail:TextInputLayout
    lateinit var etEmail:TextInputEditText
    lateinit var tilPassword:TextInputLayout
    lateinit var etPassword:TextInputEditText
    lateinit var tilConfirm:TextInputLayout
    lateinit var etconfirmp:TextInputEditText
    lateinit var tvlogin : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        btnSignup = findViewById(R.id.btnSignup)
        tilfirstname = findViewById(R.id.tilfirstname)
        etFirstname= findViewById(R.id.etFirstname)
        tilLastName = findViewById(R.id.tilLastName)
        etLastname = findViewById(R.id.etLastname)
        tileMail = findViewById(R.id.tileMail)
        etEmail = findViewById(R.id.etEmail)
        tilPassword = findViewById(R.id.tilPassword)
        etPassword = findViewById(R.id.etPassword)
        tilConfirm = findViewById(R.id.tilConfirm)
        etconfirmp= findViewById(R.id.etconfirmp)
        tvlogin = findViewById(R.id.tvlogin)
        tvlogin.setOnClickListener{
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        btnSignup.setOnClickListener { validateSignup() }
    }
    fun validateSignup(){
        var error = false
        var firstname = etFirstname.text.toString()
        if (firstname.isBlank()){
            tilfirstname.error =("FirstName is required")
            error = true
        }
        var lastname = etLastname.text.toString()
        if (lastname.isBlank()){
            tilLastName.error = ("LastName is required")
            error = true
        }
        var email = etEmail.text.toString()
        if (email.isBlank()){
            tileMail.error = ("Email is required")
            error = true
        }
        var password = etPassword.text.toString()
        if (password.isBlank()){
            tilPassword.error = ("Password is required")
            error = true
        }
        var Confirmp = etconfirmp.text.toString()
        if (Confirmp.isBlank()){
            tilConfirm.error = ("Confirm Password required")
            error = true

        }

    }
}