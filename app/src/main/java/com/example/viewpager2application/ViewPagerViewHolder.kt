package com.example.viewpager2application

import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2application.databinding.ItemViewPagerBinding

class ViewPagerViewHolder(private val binding: ItemViewPagerBinding) : RecyclerView.ViewHolder(binding.root)  {

    fun bind(model: Int) {
        binding.ivImage.setImageResource(model)
    }

    fun setOnListHolderListener(listener: ItemInteraction?, model: Int?) {

        binding.root.setOnClickListener {
            listener?.itemClicked(model)
        }
    }
}