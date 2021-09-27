package com.example.homework_005

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.homework_005.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

     private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    // private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //   binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

        //setContentView(R.layout.activity_main)


  /*      val loginButton = findViewById<Button>(R.id.btnLogin)

        loginButton.setOnClickListener {
           // val email = findViewById<EditText>(R.id.eTemail).text.toString()
            //val password = findViewById<EditText>(R.id.eTpassword).text.toString()

            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            //intent.putExtra("email", email)
            //intent.putExtra("password", password)
            startActivity(intent)
        }*/

        binding.btnLogin.setOnClickListener {
            val email: String = binding.eTemail.text.toString()
            val password: String = binding.eTpassword.text.toString()

            val intent = Intent(this@MainActivity, LoginActivity::class.java)

             intent.putExtra("email", email)
             intent.putExtra("password", password)

            startActivity(intent)  }


    }


}
