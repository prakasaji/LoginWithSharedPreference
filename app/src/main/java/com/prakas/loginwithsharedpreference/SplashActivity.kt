package com.prakas.loginwithsharedpreference

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(
            {
                val pindah = Intent(this, LoginActivity::class.java)
                startActivity(pindah)
                finish()
            },
            2000
        ) // ketika aplikasi pertama kali dibuka menampilkan splashcreen dan akan delay selama 2000s kmdn lgsg menuju halaman login
    }
}