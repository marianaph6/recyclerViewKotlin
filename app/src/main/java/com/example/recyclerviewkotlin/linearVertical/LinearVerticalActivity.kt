package com.example.recyclerviewkotlin.linearVertical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewkotlin.databinding.ActivityLinearVerticalBinding
import com.example.recyclerviewkotlin.commons.Movie
import com.example.recyclerviewkotlin.linearVertical.MovieLinearVerticalAdapter
import com.example.recyclerviewkotlin.linearVertical.MovieOnClickListener

class LinearVerticalActivity : AppCompatActivity(), MovieOnClickListener {

    private lateinit var binding: ActivityLinearVerticalBinding

    private lateinit var adapterMovies: MovieLinearVerticalAdapter

    private val data = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearVerticalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initRecyclerView()
        initData()
    }

    private fun initRecyclerView() {
        adapterMovies = MovieLinearVerticalAdapter(data, this)
        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@LinearVerticalActivity)
            adapter = adapterMovies

        }
    }

    private fun initData() {
        val newData = getData()
        data.clear()
        data.addAll(newData)
        adapterMovies.notifyDataSetChanged()
    }

    override fun onClick(movie: Movie) {
        Toast.makeText(this, movie.toString(), Toast.LENGTH_LONG).show()
    }

    private fun getData(): List<Movie> {
        return listOf(
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
        )
    }
}