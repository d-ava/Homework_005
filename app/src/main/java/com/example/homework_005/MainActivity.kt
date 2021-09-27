package com.example.homework_005

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.homework_005.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {

            val email: String = binding.eTemail.text.toString()
            val password: String = binding.eTpassword.text.toString()




            if (android.util.Patterns.EMAIL_ADDRESS.matcher(binding.eTemail.text.toString()).matches()){
                    val intent = Intent(this@MainActivity, LoginActivity::class.java)

                    intent.putExtra("email", email)
                    intent.putExtra("password", password)

                    startActivity(intent)

                }else {binding.eTemail.error = getText(R.string.wrongEmail)

                binding.btnLogin.text = getText(R.string.wrongEmail)
                }


        }


    }


}
