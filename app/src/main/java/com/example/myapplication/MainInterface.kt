package com.example.myapplication

import PersonalPageTure.Personalisation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import de.hdodenhof.circleimageview.CircleImageView

//交互页面，即主界面
class MainInterface : AppCompatActivity() {
    var toolbar: Toolbar?=null//顶部工具栏
    var drawerLayout:DrawerLayout?=null//主界面布局
    var navView:NavigationView?=null//滑动的侧栏布局
    var iconImage:CircleImageView?=null//侧栏的头像部分
    var bottomNavigationMenu:BottomNavigationView?=null//


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_interface)

        toolbar=findViewById(R.id.toolbar)
        drawerLayout=findViewById(R.id.drawerLayout)
        navView=findViewById(R.id.navView)
        iconImage=findViewById(R.id.iconImage)
        bottomNavigationMenu=findViewById(R.id.bottomAppBar2)



        iconImage?.setOnClickListener{//点击头像进入第二界面
            val intent=Intent(this, Personalisation::class.java)
            startActivity(intent)
        }


        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeAsUpIndicator(R.mipmap.liebiao)
        }
        navView?.setCheckedItem(R.id.demo1)
        navView?.setNavigationItemSelectedListener {//点击侧栏中的demo就会进入personalisation
            val intent=Intent(this, Personalisation::class.java)
            startActivity(intent)
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){//为侧栏中的菜单添加事件
            android.R.id.home ->drawerLayout?.openDrawer(GravityCompat.START)
        }
        return true
    }





}