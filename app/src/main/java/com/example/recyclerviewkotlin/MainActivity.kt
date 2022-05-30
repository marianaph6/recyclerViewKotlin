package com.example.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewkotlin.databinding.ActivityMainBinding
import com.example.recyclerviewkotlin.gridLayout.GridLayoutActivity
import com.example.recyclerviewkotlin.linearHorizontal.LinearHorizontalActivity
import com.example.recyclerviewkotlin.linearVertical.LinearVerticalActivity
import com.example.recyclerviewkotlin.staggeredGrid.StaggeredGridActivity

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        with(binding) {
            rlLinearVertical.setOnClickListener { goToLinearVertical() }
            rlLinearHorizontal.setOnClickListener { goToHorizontalVertical() }
            rlLinearGrid.setOnClickListener { goToGridLayout() }
            rlLinearStaggered.setOnClickListener { goToStaggeredLayout() }
        }
    }

    private fun goToStaggeredLayout() {
        val intent = Intent(this, StaggeredGridActivity::class.java)
        openIntent(intent)
    }

    private fun goToGridLayout() {
        val intent = Intent(this, GridLayoutActivity::class.java)
        openIntent(intent)
    }

    private fun goToLinearVertical() {
        val intent = Intent(this, LinearVerticalActivity::class.java)
        openIntent(intent)
    }

    private fun goToHorizontalVertical() {
        val intent = Intent(this, LinearHorizontalActivity::class.java)
        openIntent(intent)
    }

    private fun openIntent(intent: Intent) {
        startActivity(intent)
    }
}


