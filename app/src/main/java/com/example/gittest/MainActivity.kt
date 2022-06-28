package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gittest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            binding.text1.text = "text"
        }
    }
    var i = 0
    var l = 13
}