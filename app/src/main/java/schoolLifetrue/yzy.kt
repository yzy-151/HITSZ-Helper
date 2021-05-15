package schoolLifetrue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.myapplication.R

class yzy : AppCompatActivity() {

    private val lifeList =ArrayList<Life>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.yzy)
        initLife()//初始化水果数据，看后面定义的方法
        val recyclerView: RecyclerView? =findViewById<RecyclerView>(R.id.recycleView)
        val layoutManager= StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
//        3表示分成3行或3列，vertical控制了行与列
        recyclerView?.layoutManager=layoutManager
        val adapter= LifeAdapterRecycle(lifeList)
        recyclerView?.adapter=adapter//把整好的适配器传给recycler.adapter






    }
    private fun initLife(){
        repeat(2){
            lifeList.add(
                Life(
                    "华为的“鸿蒙”商标注册申请被驳回，原因是早在 2010年就有公司注册有关“鸿蒙”的商标，北京海岸鸿" +
                            "蒙标准物" +
                            "质技术有限责任公司就申请了化妆品类的“鸿蒙”商标",
                    R.drawable.hongmeng
                )
            )
            //这里fruitList是一个FruitAdapter类数据，这里的操作add估计就是给他添加实例
            //对这些实例执行如下操作
            lifeList.add(
                Life(
                    getRandomLengthString(
                        "轻轻的我走了，\n" +
                                "正如我轻轻的来；\n" +
                                "我轻轻的招手，\n" +
                                "作别西天的云彩。\n" +
                                "\n" +
                                "那河畔的金柳，\n" +
                                "是夕阳中的新娘；\n" +
                                "波光里的艳影，\n" +
                                "在我的心头荡漾。 "
                    ), R.drawable.sun
                )
            )
            lifeList.add(
                Life(
                    "在蒙德深夜的酒馆，若好心的你愿意和独自喝闷酒的优菈拼桌，便有机会听" +
                            "到这位酒意正吗？",
                    R.drawable.mingzuo
                )
            )
            lifeList.add(
                Life(
                    "活动开启当天「迷踪币」的获取上限为1200，之后6天内每天将解锁600「迷" +
                            "踪币」的获取上限，活动期间共计可获得4800「迷踪币」。通过匹配模式参与「风行迷踪」游戏，可以获得「迷踪币」。\n" +
                            "● 累计获得一定数量的「迷踪币」，可以领取对应的奖励。完成「迷踪挑战」任务，可获得额外摩拉奖励。",
                    R.drawable.biaoqian
                )
            )
            lifeList.add(
                Life(
                    getRandomLengthString("为加强学风考风建设，保障我校各类考试的权威性、严肃性、公平性，依据《普通高等学校学生管理规定》（教育部令第41号）、《哈尔滨工业大学（深圳）"),
                    R.drawable.daka
                )
            )
            lifeList.add(
                Life(
                    "（一）学生应提前10分钟进入考场，进入考场后须服从监考教师安排，按指定座位入座",
                    R.drawable.bianji
                )
            )
            lifeList.add(
                Life(
                    "（三）与他人交换或抄袭他人试卷、答题卡、答题纸、草稿纸等，或让他人为自己抄袭提供方便，以及通过手势暗号传递信息等；",
                    R.drawable.duihua
                )
            )
            lifeList.add(
                Life(
                    "热力学第四定律：大学时代的人生是最美好的一段时光，但大学绝不是好逸恶劳者的乐园，更不是投机取巧者的天堂" +
                            "。对自己的任何放松，放纵，都将付出惨痛的代价--gctt",
                    R.drawable.relixue
                )
            )
            lifeList.add(
                Life(
                    "四）依据本规定第三条第（九）款认定的考试作弊者，视情节轻重给予留校察看或开除学籍处分。",
                    R.drawable.baoxi
                )
            )
            lifeList.add(
                Life(
                    getRandomLengthString(""),
                    R.drawable.timu
                )
            )
            lifeList.add(
                Life(
                    "五星武器的优势在于高额的白字面板和副词条特效，比如狼末，在狼末的高额攻击力加持下，迪卢克可以将攻击力沙漏换为" +
                            "精通沙漏，达到伤害极限，当然一般情况下，这种圣遗物太阳寿了，所以一般优势也就是攻击力更高了，于是伤害就提高了。",
                    R.drawable.yuansu
                )
            )
            lifeList.add(
                Life(
                    "习近平总书记5月12日在河南省南阳市考察调研。当天下午，他首先来到医圣祠，了解“医圣”张仲景生平\" +\n" +
                            "                    及其对中医药发展作出的贡献。随后，习近平来到南阳月季博览园、南阳药益宝艾草制品有限公司，考察当地依托月季、艾草等资源优势发展特色产\" +\n" +
                            "                    业，带动群众就业等情况",
                    R.drawable.kaocha2
                )
            )
            lifeList.add(
                Life(
                    getRandomLengthString(
                        "习近平总书记5月12日在河南省南阳市考察调研。当天下午，他首先来到医圣祠，了解“医圣”张仲景生平" +
                                "及其对中医药发展作出的贡献。随后，习近平来到南阳月季博览园、南阳药益宝艾草制品有限公司，考察当地依托月季、艾草等资源优势发展特色产" +
                                "业，带动群众就业等情况。"
                    ), R.drawable.kaocha
                )
            )
        }

    }
    private fun getRandomLengthString(str:String):String{//把输入进来的字符串给重复几遍随即次数
        val n=(1..1).random()
        val builder=StringBuilder()
        repeat(n){
            builder.append(str)
        }
        return builder.toString()
    }
}