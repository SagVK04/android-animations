package com.example.myapplication


import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.github.ybq.android.spinkit.sprite.Sprite
import com.github.ybq.android.spinkit.style.DoubleBounce
import com.github.ybq.android.spinkit.style.Wave
import com.google.android.material.animation.AnimationUtils
import nl.joery.timerangepicker.TimeRangePicker


class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //binding the animation buttons
        val animtext = findViewById<TextView>(R.id.textView1)
        val fade_in = findViewById<Button>(R.id.button3)
        val fade_out = findViewById<Button>(R.id.button4)
        val zoom_in = findViewById<Button>(R.id.button1)
        val zoom_out = findViewById<Button>(R.id.button2)

        //performing animations on click of the buttons
        fade_in.setOnClickListener {
            val anim_fade_in = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.fade_in) //animation variable
            animtext.startAnimation(anim_fade_in) //start animation on the selected view
        }
        fade_out.setOnClickListener {
            val anim_fade_out = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.fade_out) //animation variable
            animtext.startAnimation(anim_fade_out) //start animation on the selected view
        }
        zoom_in.setOnClickListener {
            val anim_zoom_in = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.zoom_in) //animation variable
            animtext.startAnimation(anim_zoom_in) //start animation on the selected view
        }
        zoom_out.setOnClickListener {
            val anim_zoom_out = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.zoom_out) //animation variable
            animtext.startAnimation(anim_zoom_out) //start animation on the selected view
        }
    }
}