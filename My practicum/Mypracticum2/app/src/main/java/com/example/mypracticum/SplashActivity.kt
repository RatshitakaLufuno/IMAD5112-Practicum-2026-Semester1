package com.example.mypracticum

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Student number: ST10473990
// Full names: Lufuno Ratshitaka
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}

// References
//
//Anon., 2026. DeepSeek. [Online]
//Available at: https://www.DeepSeek.com
//[Accessed 10 June 2026].
//Anon., 2026. W3Schools. [Online]
//Available at: https://www.w3schools.com
//[Accessed 10 June 2026].
//Anon., 2026. IMAD5112 Module manual. [Online]
//Available at: https://www.Rosebank College.com
//[Accessed 10 June 2026].
//Anon., 2026. IMAD5112 Learn Module Outline. [Online]
//Available at: https://www.Rosebank College.com
//[Accessed 10 June 2026].
//
//Creating multiple pages in android app| moving between. 2020. [Film] Directed by @tonnydennis6286. s.l.: tonnydennis6286.
