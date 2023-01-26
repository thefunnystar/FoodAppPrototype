package com.example.foodappprototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAlabama = findViewById<Button>(R.id.btnAlabama)
        val btnAlaska = findViewById<Button>(R.id.btnAlaska)
        val btnArizona = findViewById<Button>(R.id.btnArizona)
        val btnArkansas = findViewById<Button>(R.id.btnArkansas)
        val btnCalifornia = findViewById<Button>(R.id.btnCalifornia)
        val btnColorado = findViewById<Button>(R.id.btnColorado)
        val btnConnecticut = findViewById<Button>(R.id.btnConnecticut)
        val btnDelaware = findViewById<Button>(R.id.btnDelaware)

        btnAlabama.setOnClickListener {
            val Intent = Intent(this, Alabama::class.java)
            startActivity(Intent)
        }

        btnAlaska.setOnClickListener {
            val Intent = Intent(this, Alaska::class.java)
            startActivity(Intent)
        }

        btnArizona.setOnClickListener {
            val Intent = Intent(this, Arizona::class.java)
            startActivity(Intent)
        }

        btnArkansas.setOnClickListener {
            val Intent = Intent(this, Arkansas::class.java)
            startActivity(Intent)
        }

        btnCalifornia.setOnClickListener {
            val Intent = Intent(this, California::class.java)
            startActivity(Intent)
        }

        btnColorado.setOnClickListener {
            val Intent = Intent(this, Colorado::class.java)
            startActivity(Intent)
        }

        btnConnecticut.setOnClickListener {
            val Intent = Intent(this, Connecticut::class.java)
            startActivity(Intent)
        }

        btnDelaware.setOnClickListener {
            val Intent = Intent(this, Delaware::class.java)
            startActivity(Intent)
        }
    }
}