package com.example.jobsheet15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.jobsheet15.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"aplikasi berjalan" ,Toast.LENGTH_SHORT).show()

        val tombol = findViewById<Button>(R.id.tombolToast)

        tombol.setOnClickListener {
            Toast.makeText(this, "Miftakhul Jannah", Toast.LENGTH_SHORT).show()
        }

            val tombolkls = findViewById<Button>(R.id.tombolKELAS)

            tombolkls.setOnClickListener {
                Toast.makeText(this, "XI PPLG 2", Toast.LENGTH_SHORT).show()
            }

                val tombolnis = findViewById<Button>(R.id.tombolnis)
                tombolnis.setOnClickListener {
                    Toast.makeText(this, "3010", Toast.LENGTH_SHORT).show()
                }
            }
        }

