package com.example.andoidwidgets

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_video_view.*

class VideoView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view)


        buttonVideoBasla.setOnClickListener {

            val video = Uri.parse("android.resource://"+packageName+"/"+R.raw.touchit)

            videoView.setVideoURI(video)
            videoView.start()

        }


        buttonVideoDur.setOnClickListener {

            videoView.stopPlayback()



        }

        buttonVideoviewNext.setOnClickListener {

             val yeniIntent = Intent(this@VideoView,TimeDatePicker::class.java)
            startActivity(yeniIntent)
        }





    }
}