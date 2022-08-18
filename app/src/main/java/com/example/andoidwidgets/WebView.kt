package com.example.andoidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_view.*

class WebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr")


        buttonToImage.setOnClickListener {

            val yeniIntent = Intent(this@WebView,ImageView::class.java)
            startActivity(yeniIntent)

        }

    }
}