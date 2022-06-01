package com.example.recyclerviewkotlin.linearVertical

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewkotlin.commons.Movie
import com.example.recyclerviewkotlin.databinding.ItemViewHolderMovieLinearVerticalBinding
import kotlin.math.roundToInt

class MovieLinearVerticalViewHolder(
    view: View
) : RecyclerView.ViewHolder(view) {

    private val binding = ItemViewHolderMovieLinearVerticalBinding.bind(view)

    fun bind(model: Movie, onClickListener: MovieOnClickListener) {
        with(binding) {
            Glide.with(itemView).load(model.url).into(imageViewLinearVerticalPrincipal)
            textViewLinearVerticalTitle.text = model.title
            textViewLinearVerticalYear.text = model.year.toString()
            textViewLinearVerticalType.text = model.type
            ratingBarLinearVerticalRating.numStars = model.rating.roundToInt()
            root.setOnClickListener {
                onClickListener.onClick(model)
            }
        }
    }
}