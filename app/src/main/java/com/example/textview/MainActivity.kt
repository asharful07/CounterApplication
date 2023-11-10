package com.example.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.textview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txt1
        var count = 0
        binding.btnCount.setOnClickListener {
            count++
            binding.txt1.text = "let's Count here : $count"
        }
        binding.btnReset.setOnClickListener {
            count = 0
            binding.txt1.text = "let's Count here :$count"
        }

    }

}