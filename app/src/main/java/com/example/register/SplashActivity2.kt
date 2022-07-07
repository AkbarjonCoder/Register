package com.example.register

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.BounceInterpolator
import android.widget.TextView
import com.example.register.manager.MySharedPreferences
import com.example.register.util.Constants
import com.google.android.material.imageview.ShapeableImageView

class SplashActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: MySharedPreferences
    private lateinit var text1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)

        anim()
        moveAnim()

        sharedPreferences = MySharedPreferences(this)
        val email = sharedPreferences.getData(Constants.EMAIL)
        intent(email)

    }

    private fun moveAnim() {
        val moveAnim = ObjectAnimator.ofFloat(text1, "Y", 1000F)
        moveAnim.duration = 2000
        moveAnim.interpolator = BounceInterpolator()
        moveAnim.start()
    }

    private fun anim(){
        text1 = findViewById(R.id.text1)
        val bounce: Animation = AnimationUtils.loadAnimation(this,R.anim.blece)
        text1.startAnimation(bounce)
    }

    private fun intent(email: String?){
        object : CountDownTimer(2000, 1000){
            override fun onTick(p0: Long) {}

            override fun onFinish() {
                if (email == null){
                    Intent(this@SplashActivity, LoginActivity::class.java).also {
                        startActivity(it)
                        finish()
                    }
                } else {
                    Intent(this@SplashActivity,LoginActivity::class.java).also {
                        startActivity(it)
                        finish()
                    }
                }
            }

        }.start()

    }


}
