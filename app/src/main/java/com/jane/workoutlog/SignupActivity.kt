package com.jane.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.jane.workoutlog.databinding.ActivityLoginBinding
import com.jane.workoutlog.databinding.ActivitySignupBinding
import java.util.regex.Pattern
import java.util.regex.PatternSyntaxException

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvlogin.setOnClickListener{
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignup.setOnClickListener { validateSignup() }
    }
    fun validateSignup(){
        var error = false
        var firstname = binding.etFirstname.text.toString()
        if (firstname.isBlank()){
            binding.tilfirstname.error =("FirstName is required")
            error = true
        }
        var lastname = binding.etLastname.text.toString()
        if (lastname.isBlank()){
            binding.tilLastName.error = ("LastName is required")
            error = true
        }
        var email = binding.etEmail.text.toString()
        if (email.isBlank()){
            binding.tileMail.error = ("Email is required")
            error = true
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tileMail.error = ("Not a valid email")
            error = true

        }
        var password = binding.etPassword.text.toString()
        if (password.isBlank()){
            binding.tilPassword.error = ("Password is required")
            error = true
        }
        var Confirmp = binding.etconfirmp.text.toString()
        if (Confirmp.isBlank()){
            binding.tilConfirm.error = ("Confirm Password required")
            error = false
        }
        if (password!=Confirmp) {
            binding.tilConfirm.error = "Incorrect password"
            error = true
        }
        if (error!=true){

        }

    }
}