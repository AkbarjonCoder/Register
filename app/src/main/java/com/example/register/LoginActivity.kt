package com.example.register

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.register.databinding.ActivityLoginBinding
import com.example.register.manager.MySharedPreferences

class LoginActivity : AppCompatActivity() {

    private lateinit var mySharedPreferences: MySharedPreferences
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mySharedPreferences = MySharedPreferences(this)

        binding.btnSignIn.setOnClickListener {
            val email1 = binding.editName.text.toString().trim()
            val pass1 = binding.editValue.text.toString().trim()
            val name1 = binding.editValue.text.toString().trim()

            mySharedPreferences.saveData(email1, pass1, name1)
            startActivity(Intent(this,MainActivity::class.java))
            finish()
            Toast.makeText(this, "SuccessFully", Toast.LENGTH_SHORT).show()
        }

        binding.sign.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
            Toast.makeText(this, "Register Activity", Toast.LENGTH_SHORT).show()
        }

        binding.goo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/"))
            startActivity(intent)
        }
        binding.tel.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:"))
            startActivity(intent)
        }
        binding.sms.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("sms:"))
            startActivity(intent)
        }

    }
}
