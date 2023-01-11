package com.example.flexboxrecyclerviewsportsinterests.Adapters


import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.flexboxrecyclerviewsportsinterests.R
import com.example.flexboxrecyclerviewsportsinterests.databinding.CustomRecViewBinding
private lateinit var binding: CustomRecViewBinding
class TagAdapter(private val list: List<String>, val context: Context) :
    RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.custom_rec_view,
            parent,
            false
        )
//        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.custom_rec_view,parent,false)
//        binding = DataBindingUtil.setContentView(parent.context as Activity,R.layout.custom_rec_view,null, false)
//        val view=LayoutInflater.from(parent.context).inflate(R.layout.custom_rec_view,parent,false)

        return MyViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tag_text.text = list[position]
//        holder.itemView.setOnClickListener {
//           holder.
//        }
        holder.bind(list[position],position)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//    val tag_text = itemView.findViewById<TextView>(R.id.tv_tag)
    val tag_text=binding.tvTag
    fun bind(word: String,p : Int){
        tag_text.text=word.toString()
        tag_text.setOnClickListener {  }
    }
}
