package com.example.register

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.register.databinding.ActivityMainBinding
import com.example.register.manager.MySharedPreferences
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {

    private lateinit var goo : TextInputEditText
    private lateinit var tel : TextInputEditText
    private lateinit var sms : TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        goo = findViewById(R.id.goo)
        tel = findViewById(R.id.tel)
        sms = findViewById(R.id.sms)





        goo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/"))
            startActivity(intent)
        }
        tel.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:"))
            startActivity(intent)
        }
        sms.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("sms:"))
            startActivity(intent)
        }

    }
}