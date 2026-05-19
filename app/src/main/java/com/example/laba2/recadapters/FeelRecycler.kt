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

class FeelRecycler(private var list: List<Mood> = emptyList()) : RecyclerView.Adapter<FeelRecycler.MVH>() {
    class MVH(v: View) : RecyclerView.ViewHolder(v) {
        val img: ImageView = v.findViewById(R.id.img)
        val txt: TextView = v.findViewById(R.id.txt)
    }
    override fun onCreateViewHolder(p: ViewGroup, t: Int) = MVH(
        LayoutInflater.from(p.context).inflate(R.layout.item_mood, p, false))
    override fun onBindViewHolder(h: MVH, i: Int) {
        val item = list[i]
        h.txt.text = item.name
        Glide.with(h.itemView.context).load(item.imageRes).placeholder(R.drawable.image_shape).into(h.img)
    }
    override fun getItemCount() = list.size

    fun setData(newList: List<Mood>) {
        list = newList
        notifyDataSetChanged()
    }
}