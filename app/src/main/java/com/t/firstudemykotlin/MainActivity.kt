package com.t.firstudemykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.t.firstudemykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonShow.setOnClickListener { binding.textViewName.text = "Hello, ${binding.editTextName.text.trim()}" }
    }
}