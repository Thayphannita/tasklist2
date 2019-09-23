package com.example.tasklistmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_splash_screen)

        //4second splash time
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this, Login::class.java))
            //finish this activity
            finish()
        },4000)
    }
}
