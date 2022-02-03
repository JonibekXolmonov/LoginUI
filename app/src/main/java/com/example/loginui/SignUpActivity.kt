package com.example.loginui

import android.content.Intent
import android.content.pm.SigningInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        initViews()
    }

    private fun initViews() {
        findViewById<TextView>(R.id.tv_sign_in).setOnClickListener {
            openSignIn()
        }

        findViewById<Button>(R.id.btn_sign_up).setOnClickListener {
            openHomeActivity()
        }
    }

    private fun openHomeActivity() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }

    private fun openSignIn() {
        startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }
}