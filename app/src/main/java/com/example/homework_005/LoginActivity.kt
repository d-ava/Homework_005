package com.example.homework_005

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_005.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    //private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityLoginBinding.inflate(layoutInflater)
         setContentView(binding.root)
        //setContentView(R.layout.activity_login)


        //val intent = intent

       // var email = intent.getStringExtra("email")
       // var password = intent.getStringExtra("password")

        // findViewById<TextView>(R.id.tVinfo).text = "email $email and password $password"

        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        binding.tVinfo.text = "email $email and password $password"
    }


}