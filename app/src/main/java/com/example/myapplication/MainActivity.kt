package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    //登录与注册的页面
    var btnSignIn:Button?=null
    var btnSignUp:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn=findViewById(R.id.btnSignIn)
        btnSignUp=findViewById(R.id.btnSignUp)



        btnSignUp?.setOnClickListener {//点击进入主界面maininterface
            val intent=Intent(this,MainInterface::class.java)
            startActivity(intent)
        }

        btnSignIn?.setOnClickListener {//点击进入一个播放视频的界面Videohaha
           val intent=Intent(this,MainInterface::class.java)
            startActivity(intent)
        }
    }


}