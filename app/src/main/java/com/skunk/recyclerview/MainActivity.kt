package com.skunk.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateList(100)
        recycler_view.adapter = rowAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateList(size:Int):List<rowItem>{
        val list = ArrayList<rowItem>()

        for (i in 0 until size){
            val drawable = when (i%3){
                0 -> R.drawable.ic_android_black_24dp
                1 -> R.drawable.ic_archive
                2 -> R.drawable.ic_backup
                else -> R.drawable.ic_assignment
            }

            val item = rowItem(drawable,"Item $i","Line 2")
            list +=item
        }
        return list
    }

}
