package com.example.flexboxrecyclerviewsportsinterests.Adapters


import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.flexboxrecyclerviewsportsinterests.R
import com.example.flexboxrecyclerviewsportsinterests.databinding.CustomRecViewBinding

class TagAdapter(val list: List<String>) : RecyclerView.Adapter<MyViewHolder>() {
    private lateinit var binding: CustomRecViewBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.custom_rec_view,parent,false)
//        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.custom_rec_view,parent,false)
//        binding = DataBindingUtil.setContentView(parent.context as Activity,R.layout.custom_rec_view,null, false)
//        val view=LayoutInflater.from(parent.context).inflate(R.layout.custom_rec_view,parent,false)
        return MyViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tag_text.text=list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tag_text = itemView.findViewById<TextView>(R.id.tv_tag)



}
