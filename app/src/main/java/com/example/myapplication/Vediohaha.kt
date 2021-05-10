package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

//这就是个没用的界面，就那个两只老虎爱跳舞的链接。没用的
class Vediohaha : AppCompatActivity() {
    var videoView: VideoView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vediohaha)
        videoView=findViewById(R.id.videoView)
        val uri = Uri.parse("android.resource://$packageName/${R.raw.a3}")
        videoView?.setVideoURI(uri)
        videoView?.start()
    }
    override fun onDestroy() {
        super.onDestroy()
        videoView?.suspend()
    }
}