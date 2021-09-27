package com.example.homework_005

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_005.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         setContentView(binding.root)


        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        binding.tVemailInfo.text = "email = $email"
        binding.tVPasswordInfo.text = "password = $password"
    }


}