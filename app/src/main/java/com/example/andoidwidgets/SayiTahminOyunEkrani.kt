package com.example.andoidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_sayi_tahmin_oyun_ekrani.*
import kotlin.random.Random

class SayiTahminOyunEkrani : AppCompatActivity() {

    private var rastgeleSayi = 0

    private var sayac = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayi_tahmin_oyun_ekrani)

        rastgeleSayi = Random.nextInt(101) // 0 ile 100 arasında rastgele sayı üretir.

        Log.e("Rastgele Sayı",rastgeleSayi.toString())

        buttonToSonucEkrani.setOnClickListener {
            sayac = sayac - 1

            val tahmin = editTextGirdi.text.toString().toInt()

            if (tahmin == rastgeleSayi){
                val yeniIntent = Intent(this@SayiTahminOyunEkrani,SayiTahminSonucEkrani::class.java)
                yeniIntent.putExtra("sonuc",true)
                startActivity(yeniIntent)
                return@setOnClickListener
                finish()
            }

            if (tahmin > rastgeleSayi){
                textViewYardimci.text = "Azalt"
                textViewKalanHak.text = "Kalan Hak : $sayac" }

            if (tahmin < rastgeleSayi){
                textViewYardimci.text = "Arttır"
                textViewKalanHak.text = "Kalan Hak : $sayac" }

            if (sayac == 0){
                val yeniIntent = Intent(this@SayiTahminOyunEkrani,SayiTahminSonucEkrani::class.java)
                yeniIntent.putExtra("sonuc",false)
                finish()
                startActivity(yeniIntent)
            }
            editTextGirdi.setText("")
        }
    }
}