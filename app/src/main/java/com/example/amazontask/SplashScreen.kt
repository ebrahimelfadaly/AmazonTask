package com.example.amazontask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

import com.example.amazontask.databinding.ActivitySplashScreenBinding
import android.view.animation.AnimationUtils
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashScreen : AppCompatActivity() {
    var SPLASH_SCREEN = 1
    lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)




   GlobalScope.launch {
       var topAnimation = AnimationUtils.loadAnimation(this@SplashScreen, R.anim.top_animation)
       AnimationUtils.loadAnimation(this@SplashScreen, R.anim.button_animation)
       binding.imageView.animation = topAnimation

       delay(3000)
       var intent =Intent(this@SplashScreen,MainActivity::class.java)
       startActivity(intent)
       finish()
   }



    }
}