package com.example.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initViews()
    }

    private fun initViews() {
        findViewById<TextView>(R.id.tv_sign_up).setOnClickListener {
            openSignUpPage()
        }

        findViewById<Button>(R.id.btn_sign_in).setOnClickListener {
            openHomeActivity()
        }
    }

    private fun openHomeActivity() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }

    private fun openSignUpPage() {
        startActivity(Intent(this, SignUpActivity::class.java))
        finish()
    }
}