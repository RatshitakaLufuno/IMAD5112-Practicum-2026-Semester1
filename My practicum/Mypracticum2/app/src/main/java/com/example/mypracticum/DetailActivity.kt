package com.example.mypracticum

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Student number: ST10473990
// Full names: Lufuno Ratshitaka

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtDetails = findViewById<TextView>(R.id.txtDetails)
        val btnBack = findViewById<Button>(R.id.btnBack)

        var displayText = ""
        for (i in DataManager.itemNames.indices) {
            displayText += "Item: ${DataManager.itemNames[i]}\n" +
                    "Category: ${DataManager.categories[i]}\n" +
                    "Quantity: ${DataManager.quantities[i]}\n" +
                    "Comments: ${DataManager.comments[i]}\n\n"
        }

        txtDetails.text = if (displayText.isEmpty()) "No items packed yet." else displayText

        btnBack.setOnClickListener {
            finish()
        }
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
