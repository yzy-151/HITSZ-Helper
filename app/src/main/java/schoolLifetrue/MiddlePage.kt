package schoolLifetrue

import SomethingUseless.Vediohaha
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.MainInterface
import com.example.myapplication.R

class MiddlePage : AppCompatActivity() {
    var btnHot:Button?=null
    var btnNew:Button?=null
    var btnReturn2:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_middle_page)

        btnHot=findViewById(R.id.btnHot)
        btnNew=findViewById(R.id.btnNew)
        btnReturn2=findViewById(R.id.btnReturn2)

        btnNew?.setOnClickListener {
            val intent= Intent(this,Yzy::class.java)
            startActivity(intent)
        }
        btnHot?.setOnClickListener {
            val intent= Intent(this,Vediohaha::class.java)
            startActivity(intent)
        }
        btnReturn2?.setOnClickListener {
            val intent= Intent(this,MainInterface::class.java)
            startActivity(intent)
        }

    }
}