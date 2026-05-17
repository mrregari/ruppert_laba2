package com.example.laba2.recadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.laba2.R
import com.example.laba2.data.Mood

class FeelRecycler(private val list: List<Mood>) : RecyclerView.Adapter<FeelRecycler.MVH>() {

    class MVH(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.img)
        val txt: TextView = view.findViewById(R.id.txt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MVH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mood, parent, false)
        return MVH(view)
    }

    override fun onBindViewHolder(holder: MVH, position: Int) {
        val item = list[position]
        holder.txt.text = item.name
        Glide.with(holder.itemView.context)
            .load(item.imageRes)
            .placeholder(R.drawable.image_shape)
            .into(holder.img)
    }

    override fun getItemCount(): Int = list.size
}