package com.gir.take_guide

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class guide_options : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_guide_options)


        val cd1 = findViewById<CardView>(R.id.cd1)
        val cd2 = findViewById<CardView>(R.id.cd2)
        val cd3 = findViewById<CardView>(R.id.cd3)
        val cd4 = findViewById<CardView>(R.id.cd4)

        cd1.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/machine-learning/machine-learning/")
            startActivity(intent)
        }

        cd2.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/android/android-tutorial/")
            startActivity(intent)
        }

        cd3.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/c/c-programming-language/")
            startActivity(intent)
        }

        cd4.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/software-engineering/software-development-process-step-by-step-guide/")
            startActivity(intent)
        }
    }
}