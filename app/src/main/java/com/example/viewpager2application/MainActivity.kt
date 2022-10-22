package com.example.viewpager2application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , ItemInteraction {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4
        )


        val adapter = ViewPagerAdapter(images)
        binding.viewpager.adapter = adapter
        adapter.setListener(this)

//        binding.viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewpager.orientation = ViewPager2.ORIENTATION_VERTICAL

        binding.viewpager.beginFakeDrag()
        binding.viewpager.fakeDragBy(-10f)
        binding.viewpager.endFakeDrag()
    }

    override fun itemClicked(model: Int?) {
        Toast.makeText(this,"item clicked" , Toast.LENGTH_SHORT).show()
    }
}