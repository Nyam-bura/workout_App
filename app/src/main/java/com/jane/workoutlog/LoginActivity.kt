package com.jane.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.TextElementListener
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.jane.workoutlog.databinding.ActivityHomePageBinding
import com.jane.workoutlog.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        castViews()
    }


    fun castViews(){



        binding.tvsignup.setOnClickListener {
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            validateLogin()
            startActivity(Intent(this,Home_pageActivity::class.java))
        }



    }
    fun validateLogin(){
        var error = false
        binding.tilEmail.error = null
        binding.tilPassword.error = null
        var email = binding.etemail.text.toString()
        if (email.isBlank()){
            binding.tilEmail.error = "Email is required"
            error = true
        }
        var password  = binding.etpassword.text.toString()
        if (password.isBlank()){
            binding.tilPassword.error = "Password is required"
            error = true

        }
        if (error!=true){


        }

    }
}