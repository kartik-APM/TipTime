package com.example.tiptime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener { calculateTip() }

    }

    fun calculateTip() {
        val stringInTextField = binding.etCostOfService.text.toString()
        val cost = stringInTextField.toDouble()
        val selectedId = binding.rgTip.checkedRadioButtonId
        val tipPrecentage = when (selectedId) {
            R.id.rbTwentyPercent -> 0.20
            R.id.rbFifteenPercent -> 0.15
            else -> 0.10
        }
        var tip = cost * tipPrecentage
        val roundUp = binding.swcRoundUp.isChecked
        if (roundUp) {
            tip = ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)

        binding.tvResult.text = getString(R.string.Tip_Amount, formattedTip)

    }

}