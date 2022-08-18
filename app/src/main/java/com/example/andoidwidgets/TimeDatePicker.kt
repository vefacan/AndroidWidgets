package com.example.andoidwidgets

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_time_date_picker.*
import java.util.*
import kotlin.collections.ArrayList

class TimeDatePicker : AppCompatActivity() {

    private val ulkeler = ArrayList<String>()
    private lateinit var veriAdaptoru:ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_date_picker)

        editTextSaat.setOnClickListener {

            val calendar = Calendar.getInstance()

            val saat = calendar.get(Calendar.HOUR_OF_DAY)
            val dakika = calendar.get(Calendar.MINUTE)

            val timePicker = TimePickerDialog(this@TimeDatePicker,TimePickerDialog.OnTimeSetListener { timePicker, s, dk ->
                editTextSaat.setText("$s : $dk")
            },saat,dakika,true)

            timePicker.setTitle("Saat Seçiniz:")
            timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"AYARLA",timePicker)
            timePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İPTAL",timePicker)

            timePicker.show()
        }


        editTextTarih.setOnClickListener {

            val calendar = Calendar.getInstance()

            val yil = calendar.get(Calendar.YEAR)
            val ay = calendar.get(Calendar.MONTH)
            val gun = calendar.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(this@TimeDatePicker,DatePickerDialog.OnDateSetListener { datePicker, y, a, g ->
                editTextTarih.setText("$g/${a+1}/$y")
            },yil,ay,gun)

            datePicker.setTitle("Tarih Seçiniz:")
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"AYARLA",datePicker)
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İPTAL",datePicker)

            datePicker.show()
        }

        ulkeler.add("Türkiye")
        ulkeler.add("Almanya")
        ulkeler.add("Japonya")
        ulkeler.add("İtalya")
        ulkeler.add("Çin")
        ulkeler.add("İspanya")
        ulkeler.add("Portekiz")

        veriAdaptoru = ArrayAdapter(this@TimeDatePicker,android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler)
        spinner.adapter = veriAdaptoru

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {
                Toast.makeText(applicationContext,"Seçilen ülke : ${ulkeler[indeks]}",Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }


        }

        buttonSpinGoster.setOnClickListener {

            Toast.makeText(applicationContext,"Seçilen ülke : ${ulkeler[spinner.selectedItemPosition]}",Toast.LENGTH_SHORT).show()

        }
    }
}