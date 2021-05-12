package com.example.tiptime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.btnCalculate.setOnClickListener { calculateTip() }

    }
    /*fun calculateTip(){
        val stringInTextField = binding.etCostOfService.text.toString()
        val cost = stringInTextField.toDouble()
    }

     */

}