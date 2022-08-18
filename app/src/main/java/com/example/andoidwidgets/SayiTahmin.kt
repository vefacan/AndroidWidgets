package com.example.andoidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_sayi_tahmin.*
import kotlin.random.Random

class SayiTahmin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayi_tahmin)

        buttonToOyunEkrani.setOnClickListener {
            startActivity(Intent(this@SayiTahmin,SayiTahminOyunEkrani::class.java))
        }
    }
}