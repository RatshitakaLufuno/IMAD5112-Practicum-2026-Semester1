package com.example.mypracticum

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Student number: ST10473990
// Full names: Lufuno Ratshitaka
class MainActivity : AppCompatActivity() {

    private lateinit var txtTotal: TextView
    private lateinit var edtName: EditText
    private lateinit var edtCategory: EditText
    private lateinit var edtQuantity: EditText
    private lateinit var edtComment: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtTotal = findViewById(R.id.txtTotal)
        edtName = findViewById(R.id.edtName)
        edtCategory = findViewById(R.id.edtCategory)
        edtQuantity = findViewById(R.id.edtQuantity)
        edtComment = findViewById(R.id.edtComment)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnView = findViewById<Button>(R.id.btnView)

        updateTotal()

        btnAdd.setOnClickListener {
            try {
                val name = edtName.text.toString()
                val category = edtCategory.text.toString()
                val quantityText = edtQuantity.text.toString()
                val comment = edtComment.text.toString()

                if (name.isEmpty() || category.isEmpty() || quantityText.isEmpty() || comment.isEmpty()) {
                    Toast.makeText(this, "Please complete all fields", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val quantity = quantityText.toInt()

                DataManager.itemNames.add(name)
                DataManager.categories.add(category)
                DataManager.quantities.add(quantity)
                DataManager.comments.add(comment)

                Log.d("CampsiteCommander", "Item Added: $name")
                Toast.makeText(this, "Gear Added Successfully", Toast.LENGTH_SHORT).show()

                updateTotal()
                clearFields()

            } catch (e: Exception) {
                Toast.makeText(this, "Quantity must be numeric", Toast.LENGTH_SHORT).show()
                Log.e("CampsiteCommander", e.message.toString())
            }
        }

        btnView.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }

    private fun updateTotal() {
        txtTotal.text = "Total Items Packed: ${DataManager.calculateTotalItems()}"
    }

    private fun clearFields() {
        edtName.text.clear()
        edtCategory.text.clear()
        edtQuantity.text.clear()
        edtComment.text.clear()
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
