package com.example.andoidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_secim_ekrani.*

class SecimEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secim_ekrani)




        buttonBitir.setOnClickListener {

            val javaDurum = checkBoxJava.isChecked
            val kotlinDurum = checkBoxKotlin.isChecked
            val cSharpDurum = checkBoxC.isChecked
            val fenerbahceDurum = radioButtonFenerbahce.isChecked
            val galatasarayDurum = radioButtonGalatasaray.isChecked
            val besiktasDurum = radioButtonBesiktas.isChecked

            Log.e("Java Durum",javaDurum.toString())
            Log.e("Kotin Durum",kotlinDurum.toString())
            Log.e("C# Durum",cSharpDurum.toString())
            Log.e("Fenerbahçe Durum",fenerbahceDurum.toString())
            Log.e("Galatasaray Durum",galatasarayDurum.toString())
            Log.e("Beşiktaş Durum",besiktasDurum.toString())


            val yeniIntent = Intent(this@SecimEkrani,OylamaEkrani::class.java)
            startActivity(yeniIntent)
        }







    }
}