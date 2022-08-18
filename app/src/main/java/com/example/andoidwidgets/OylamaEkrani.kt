package com.example.andoidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import com.google.android.material.slider.Slider
import kotlinx.android.synthetic.main.activity_oylama_ekrani.*

class OylamaEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oylama_ekrani)


        buttonBasla.setOnClickListener {
            progressBar.visibility = View.VISIBLE
        }
        buttonDur.setOnClickListener {
            progressBar.visibility = View.INVISIBLE
        }


        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    textViewSonuc.text = "Sonuç : $p1"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        buttonGoster.setOnClickListener {

            val gelenIlerleme = slider.progress
            val gelenOylama = ratingBar.rating

            Log.e("İlerlmee",gelenIlerleme.toString())
            Log.e("Oylama",gelenOylama.toString())

            val yeniIntent = Intent(this@OylamaEkrani,WebView::class.java)
            startActivity(yeniIntent)

        }







    }
}