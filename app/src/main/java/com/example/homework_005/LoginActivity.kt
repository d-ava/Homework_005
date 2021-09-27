package com.example.homework_005

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_005.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }



    @SuppressLint("SetTextI18n") //wtf? check later
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         setContentView(binding.root)


        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")
        val emailString = getText(R.string.email_info)
        val passwordString = getString(R.string.password_info)

        binding.tVemailInfo.text ="$emailString  $email "
        binding.tVPasswordInfo.text = "$passwordString  $password"
    }


}