package com.example.andoidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGiris.setOnClickListener {

            val yeniIntent = Intent(this@MainActivity,SecimEkrani::class.java)
            startActivity(yeniIntent)

        }

            switch1.setOnCheckedChangeListener { compoundButton, b ->

                if(b){
                    Log.e("Switch","On")
                }else{
                    Log.e("Switch","Off")
                }
            }


        buttonToSayiTahmin.setOnClickListener {


            val yeniIntent = Intent(this@MainActivity,SayiTahmin::class.java)
            startActivity(yeniIntent)

        }

    }
}


