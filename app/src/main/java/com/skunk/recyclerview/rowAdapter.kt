package com.skunk.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_item.view.*

class rowAdapter(private val exampleList:List<rowItem>) : RecyclerView.Adapter<rowAdapter.rowViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rowViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)

        return rowViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: rowViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
    }

    override fun getItemCount() = exampleList.size//: Int {
        //return exampleList.size

   //}


    class rowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val imageView:ImageView = itemView.image_view
        val textView1:TextView = itemView.text_view_1
        val textView2:TextView = itemView.text_view_2
    }
}