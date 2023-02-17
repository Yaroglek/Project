package com.example.test

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY = "key"
    }

    private lateinit var binding: ActivityMainBinding

    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("MainActivity_State", "onCreate")
        number = savedInstanceState?.getInt(KEY) ?: 0
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        binding.number.text = number.toString()
        binding.Button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java).apply {
                putExtra(KEY, number * number)})
        }
    }

    override fun onStart() {
        Log.e("MainActivity_State", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("MainActivity_State", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("MainActivity_State", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("MainActivity_State", "onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        number++
        outState.putInt(KEY, number)
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        Log.e("MainActivity_State", "onDestroy")
        super.onDestroy()
    }
}