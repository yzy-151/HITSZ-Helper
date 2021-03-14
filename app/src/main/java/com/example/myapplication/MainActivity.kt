package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignIn:Button=findViewById(R.id.btnSignIn)
        val btnSignUp:Button=findViewById(R.id.btnSignUp)

        btnSignUp.setOnClickListener {
            val intent=Intent(this,MainInterface::class.java)
            startActivity(intent)
        }

        btnSignIn.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://www.bilibili.com/video/BV1dU4y1W7qo?from=search&seid=11136257010251578185")
            startActivity(intent)
        }
    }
}