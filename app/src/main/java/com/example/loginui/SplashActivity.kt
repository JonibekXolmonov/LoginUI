package com.example.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        countDownTimer()
    }

    private fun countDownTimer(){
        object: CountDownTimer(2000,1000){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                openLoginPage()
            }
        }.start()
    }

    private fun openLoginPage() {
        startActivity(Intent(this,SignInActivity::class.java))
        finish()
    }
}