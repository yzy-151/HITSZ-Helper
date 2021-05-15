package schoolLifetrue

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class LifeAdapterRecycle(val lifeList: List<Life>) :
    RecyclerView.Adapter<LifeAdapterRecycle.ViewHolder>(){
    inner class ViewHolder(view:View): RecyclerView.ViewHolder(view){//定义一个内部类，继承自recycler.viewHolder
//        这个类用来装缓存，只有两个东西
    val lifeImage:ImageView=view.findViewById(R.id.lifeImage)
        val lifeName:TextView=view.findViewById(R.id.lifeName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.life_item,parent,false)//传入布局
        val viewHolder=ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
            val position=viewHolder.adapterPosition
            val life2=lifeList[position]
            Toast.makeText(parent.context,"你点击了整个子控件${life2.name}", Toast.LENGTH_SHORT).show()
        }
        viewHolder.lifeImage.setOnClickListener{
            val position=viewHolder.adapterPosition
            val life3=lifeList[position]
            Toast.makeText(parent.context,"你点击了这个控件中的图片${life3.name}", Toast.LENGTH_SHORT).show()
        }
        return ViewHolder(view)
    }

    override fun getItemCount()=lifeList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val life=lifeList[position]
        holder.lifeImage.setImageResource(life.imageId)
//        这个holder就是viewHolder，里面有着fruit_item,依据传入的位置，为每个viewHolder设置图像与名称
//        而这个fruit就是fruitList，这是把fruitList里面的图片数据搞进holder
        holder.lifeName.text=life.name
    }
}
