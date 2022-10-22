package com.example.viewpager2application

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2application.databinding.ItemViewPagerBinding

class ViewPagerAdapter(val images: List<Int>) : RecyclerView.Adapter<ViewPagerViewHolder>() {

    // CTRL + I  to suggest methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val binding = ItemViewPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val model = images[position]
        holder.bind(model)
        holder.setOnListHolderListener(listener, model)
    }

    override fun getItemCount(): Int {
        return images.size
    }


    private var listener: ItemInteraction? = null
    fun setListener(listener: ItemInteraction) {
        this.listener = listener
    }


}