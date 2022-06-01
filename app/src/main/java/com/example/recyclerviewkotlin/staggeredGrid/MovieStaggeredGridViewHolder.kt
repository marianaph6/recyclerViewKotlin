package com.example.recyclerviewkotlin.staggeredGrid

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewkotlin.commons.Movie
import com.example.recyclerviewkotlin.databinding.ItemViewHolderMovieStaggeredGridBinding
import kotlin.math.roundToInt

class MovieStaggeredGridViewHolder(
    view: View
) : RecyclerView.ViewHolder(view) {

    private val binding = ItemViewHolderMovieStaggeredGridBinding.bind(view)

    fun bind(model: Movie, onClickListener: MovieOnClickListener) {
        with(binding) {
            Glide.with(itemView).load(model.url).into(imageViewStaggeredGridPrincipal)
            textViewStaggeredGridTitle.text = model.title
            textViewStaggeredGridYear.text = model.year.toString()
            textViewStaggeredGridType.text= model.type
            ratingBarStaggeredGridRating.numStars = model.rating.roundToInt()
            root.setOnClickListener {
                onClickListener.onClick(model)
            }
        }
    }
}