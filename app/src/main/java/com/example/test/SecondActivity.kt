package com.example.test
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityTwoBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTwoBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("SecondActivity_State", "onCreate")
        number = intent?.getIntExtra(MainActivity.KEY, 0) ?: number
        number = savedInstanceState?.getInt(MainActivity.KEY) ?: number
        binding = ActivityTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.numberPow.text = number.toString()
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.e("SecondActivity_State", "onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.e("SecondActivity_State", "onPause")
        super.onPause()
    }

    override fun onResume() {
        Log.e("SecondActivity_State", "onResume")
        super.onResume()
    }

    override fun onStop() {
        Log.e("SecondActivity_State", "onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(MainActivity.KEY, number)
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        Log.e("SecondActivity_State", "onDestroy")
        super.onDestroy()
    }
}