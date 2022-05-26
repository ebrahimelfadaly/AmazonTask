package com.example.amazontask

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.amazontask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var num = 0
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.qutnum.text = num.toString()
        binding.mins.setOnClickListener {
            num = ((binding.qutnum.text.toString().toInt()) - 1)
            if (num > 0) {
                binding.qutnum.text = num.toString()

            } else {
                num = 0
            }
        }
        binding.plus.setOnClickListener {
            num = ((binding.qutnum.text.toString().toInt()) + 1)
            binding.qutnum.text = num.toString()
        }
        binding.blue1.setOnClickListener {
            binding.green2.visibility = View.GONE

            binding.red2.visibility = View.GONE
            binding.yellow2.visibility = View.GONE
            binding.green1.visibility = View.GONE

            binding.red1.visibility = View.GONE
            binding.yellow1.visibility = View.GONE
        }
        binding.red1.setOnClickListener {
            binding.green2.visibility = View.GONE
            binding.yellow2.visibility = View.GONE
            binding.blue2.visibility = View.GONE
            binding.green1.visibility = View.GONE
            binding.yellow1.visibility = View.GONE
            binding.blue1.visibility = View.GONE
        }
        binding.yellow1.setOnClickListener {
            binding.green2.visibility = View.GONE
            binding.red2.visibility = View.GONE
            binding.blue2.visibility = View.GONE
            binding.green1.visibility = View.GONE
            binding.red1.visibility = View.GONE
            binding.blue1.visibility = View.GONE
        }
        binding.green1.setOnClickListener {
            binding.yellow2.visibility = View.GONE
            binding.red2.visibility = View.GONE
            binding.blue2.visibility = View.GONE
            binding.yellow1.visibility = View.GONE
            binding.red1.visibility = View.GONE
            binding.blue1.visibility = View.GONE
        }


    }
    fun clickonClor(s: Int) {
        when (s) {
            1 -> {
                binding.green2.visibility = View.GONE
                binding.red2.visibility = View.GONE
                binding.blue2.visibility = View.GONE
            }
            2 -> {
                binding.green2.visibility = View.GONE
                binding.yellow2.visibility = View.GONE
                binding.blue2.visibility = View.GONE
            }
            3 -> {
                binding.green2.visibility = View.GONE
                binding.yellow2.visibility = View.GONE
                binding.red2.visibility = View.GONE
            }
            4 -> {
                binding.red2.visibility = View.GONE
                binding.yellow2.visibility = View.GONE
                binding.blue2.visibility = View.GONE
            }

        }
    }
}