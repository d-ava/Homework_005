package com.example.homework_005

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_005.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

     private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         setContentView(binding.root)



        binding.btnLogin.setOnClickListener {
            val email: String = binding.eTemail.text.toString()
            val password: String = binding.eTpassword.text.toString()

            val intent = Intent(this@MainActivity, LoginActivity::class.java)

             intent.putExtra("email", email)
             intent.putExtra("password", password)

            startActivity(intent)  }


    }


}
