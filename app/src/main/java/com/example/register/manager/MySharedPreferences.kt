package com.example.register.manager

import android.content.Context
import android.content.SharedPreferences
import com.example.register.util.Constants.EMAIL
import com.example.register.util.Constants.NAME
import com.example.register.util.Constants.PASS
import com.example.register.util.Constants.PREFS_NAME

class MySharedPreferences(private val context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun saveData(email: String, pass: String, name: String) {
        val edit = sharedPreferences.edit()
        edit.putString(EMAIL, email)
        edit.putString(PASS, pass)
        edit.putString(NAME, name)
        edit.apply()
    }
    fun getData(key:String):String?{
        return sharedPreferences.getString(key, null)
    }
    fun clear(){
        val edit = sharedPreferences.edit()
        edit.clear()
        edit.apply()
    }

}