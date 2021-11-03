package com.yoon.busappkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IntroActivity : AppCompatActivity() {
    private val This = this;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        startMainActivity()
    }

    private fun startMainActivity(){
        val mmIntent = Intent(This, MainActivity::class.java)
        startActivity(mmIntent)
    }
}