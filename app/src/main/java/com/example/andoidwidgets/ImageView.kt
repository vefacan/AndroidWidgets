package com.example.andoidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image_view.*

class ImageView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)


        buttonResim1.setOnClickListener {

            imageView.setImageResource(R.drawable.basaramadik)


        }


        buttonResim2.setOnClickListener {

            imageView.setImageResource(R.drawable.vefahuso)



        }


        buttonNext.setOnClickListener {

         val yeniIntent = Intent(this@ImageView,VideoView::class.java)
                    startActivity(yeniIntent)
        }

    }
}