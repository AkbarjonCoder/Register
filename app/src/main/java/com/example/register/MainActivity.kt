package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.register.databinding.ActivityMainBinding
import com.example.register.manager.MySharedPreferences
import com.example.register.util.Constants

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mySharedPreferences: MySharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mySharedPreferences = MySharedPreferences(this)

        val email = mySharedPreferences.getData(Constants.EMAIL)
        val pass = mySharedPreferences.getData(Constants.PASS)

        binding.text2.text = email
        binding.tex3.text = pass

        binding.btnOut.setOnClickListener {
            mySharedPreferences.clear()
            finish()
        }


    }
}