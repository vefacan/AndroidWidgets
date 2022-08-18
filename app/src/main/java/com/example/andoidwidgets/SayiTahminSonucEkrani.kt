package com.example.andoidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayi_tahmin_sonuc_ekrani.*

class SayiTahminSonucEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayi_tahmin_sonuc_ekrani)


        val sonuc = intent.getBooleanExtra("sonuc",false)

        if (sonuc){
            textViewSayiTahminSonuc.text = "HELAAAAAAAAAAĞL!!!"
            imageViewSonuc.setImageResource(R.drawable.mutlu_resim)
        }else{
            textViewSayiTahminSonuc.text = "Maga beee..."
            imageViewSonuc.setImageResource(R.drawable.uzgun_resim)
        }

        buttonToTekrar.setOnClickListener {
            startActivity(Intent(this@SayiTahminSonucEkrani,SayiTahmin::class.java))
            finish()
        }
    }
}