package com.coolcats.buildtypescats

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.coolcats.buildtypescats.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if(BuildConfig.DEBUG_MODE){
            binding.textView.text = "Debug Mode"
            binding.mainView.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_500))
        } else {
            binding.textView.text = "Release Mode"
        }

    }
}