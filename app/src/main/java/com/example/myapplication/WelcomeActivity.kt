package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener

//进入软件后一个短暂的动画停顿。就那个H
class WelcomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val imageView4:ImageView=findViewById(R.id.imageView4)
        ViewCompat.animate(imageView4).apply {
            scaleX(1.0f)//停顿的时间
            scaleY(1.0f)
            duration =1000

            setListener(object : ViewPropertyAnimatorListener {
                override fun onAnimationEnd(view: View?) {
                    startActivity(Intent(this@WelcomeActivity,MainActivity::class.java))
                    finish()
                }

                override fun onAnimationCancel(view: View?) {

                }

                override fun onAnimationStart(view: View?) {
                }
            })
                }
                }
            }
