package com.example.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    private val fruits = arrayListOf<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        initData()
        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = FruitID(fruits)

    }

    private fun initData() {

        for( i in 0..10) {

            fruits.add(Fruit().apply {
                name = "香蕉"
                description =
                    "香蕉属高热量水果，在一些热带地区香蕉还作为主要粮食。香蕉果肉营养价值颇高，此外，还含多种微量元素和维生素。"
                avatar = R.mipmap.xj
            })

            fruits.add(Fruit().apply {
                name = "苹果"
                description =
                    "果肉黄白色、致密细脆、多汁、酸甜适度。国光苹果：果肉白色或是淡黄色、肉质脆、较细、多汁、味道偏酸。"
                avatar = R.mipmap.tz
            })
            fruits.add(Fruit() .apply {
                name = "菠萝"
                description =
                    "凤梨味甘、微酸，性微寒，有清热解暑、生津止渴、利小便的功效，可用于伤暑、身热烦渴、腹中痞闷、消化不良、小便不利、头昏眼花等症。而且在果汁中，还含有一种跟胃液相类似的酵素，可以分解蛋白，帮助消化。"
                avatar = R.mipmap.bl
            })
        }

    }
}