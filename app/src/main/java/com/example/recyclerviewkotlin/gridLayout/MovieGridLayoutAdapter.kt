package com.example.recyclerviewkotlin.gridLayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.R
import com.example.recyclerviewkotlin.commons.Movie

class MovieGridLayoutAdapter(
    val data: List<Movie>,
    //Clase que instancia la interfaz
    val onClickListener: MovieOnClickListener
) : RecyclerView.Adapter<MovieGridLayoutViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieGridLayoutViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MovieGridLayoutViewHolder(
            layoutInflater.inflate(
                R.layout.item_view_holder_movie_grid_layout,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieGridLayoutViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = data.size

}
//Se le devuelve la info del objeto que seleccionó (Movie)
interface MovieOnClickListener {
    fun onClick(movie: Movie)
}