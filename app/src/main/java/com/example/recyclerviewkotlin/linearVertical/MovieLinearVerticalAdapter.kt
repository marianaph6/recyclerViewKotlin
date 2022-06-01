package com.example.recyclerviewkotlin.linearVertical

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.R
import com.example.recyclerviewkotlin.commons.Movie

class MovieLinearVerticalAdapter(
    val data: List<Movie>,

    //Clase que instancia la interfaz
    val onClickListener: MovieOnClickListener
) : RecyclerView.Adapter<MovieLinearVerticalViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieLinearVerticalViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MovieLinearVerticalViewHolder(
            layoutInflater.inflate(
                R.layout.item_view_holder_movie_linear_vertical,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieLinearVerticalViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = data.size

}
//Se le devuelve la info del objeto que seleccionó (Movie)
interface MovieOnClickListener {
    fun onClick(movie: Movie)
}