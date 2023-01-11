package com.example.flexboxrecyclerviewsportsinterests

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.flexboxrecyclerviewsportsinterests.Adapters.TagAdapter
import com.example.flexboxrecyclerviewsportsinterests.databinding.ActivityMainBinding
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val flexboxLayoutManager=FlexboxLayoutManager(this)
        flexboxLayoutManager.justifyContent=JustifyContent.CENTER
        flexboxLayoutManager.flexDirection=FlexDirection.ROW
        binding.rvMain.layoutManager=FlexboxLayoutManager(this)
        binding.rvMain.adapter = TagAdapter(initArray())
    }

    fun initArray():List<String>{
        val list= mutableListOf<String>()
        list.add("m")
        list.add("ma")
        list.add("man")
        list.add("m")
        list.add("mansoor")
        list.add("man")
        list.add("mansoor k")
        list.add("usama khan")
        list.add("waqar khan")
        list.add("ali shair khan")
        list.add("meer hadi khan")
        list.add("muhammad hammad khan")
        list.add("haseeb rana khan")
        list.add("danish tariq khan")
        list.add("mustafa shaheen khan")
        list.add("muhammad usman mian khan")
        list.add("khan")
        return list
    }

}