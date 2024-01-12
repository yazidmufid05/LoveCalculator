package com.example.kalkulatorlove

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPertama: EditText = findViewById(R.id.etValue1)
        val editTextKedua: EditText = findViewById(R.id.etValue2)
        val tvValue: TextView = findViewById(R.id.tvValue) // Ganti dari btnKalkulasi ke tvValue

        val btnKalkulasi: Button = findViewById(R.id.btnKalkulasi)

        btnKalkulasi.setOnClickListener {
            Toast.makeText(this, "Tekan", Toast.LENGTH_SHORT).show()

            // Mendapatkan nilai acak antara 0 dan 100
            val randomValue = Random().nextInt(101)

            // Menampilkan nilai acak di tvValue
            tvValue.text = "$randomValue%"
        }
    }
}
