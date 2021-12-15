package com.utcc.momandkit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val data: ArrayList<Post>, feedFragment: feedFragment): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
       val image = itemView.findViewById<ImageView>(R.id.img_profile)
       val title = itemView.findViewById<TextView>(R.id.txt_title)
       val imagePost = itemView.findViewById<ImageView>(R.id.img_post)
        fun bin(data: Post){
            image.setImageResource(data.image)
            title.text = data.title
            imagePost.setImageResource(data.imagePost)
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_feed,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bin(data[position])
    }

    override fun getItemCount() = data.size
}