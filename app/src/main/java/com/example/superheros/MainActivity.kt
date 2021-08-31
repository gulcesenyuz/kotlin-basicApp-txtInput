package com.example.superheros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createSuperHero(view: View) {
        val name : TextView = findViewById(R.id.nameText)

        val age : TextView = findViewById(R.id.ageText)
        val prof : TextView = findViewById(R.id.profText)
        val result : TextView= findViewById(R.id.resultText)

        val hero= SuperHero(name.text.toString(), age.text.toString().toInt(), prof.text.toString()  )


       result.text = "Name: ${  hero.name }, Age: ${hero.age}, Profession: ${hero.prof}"


    }
}