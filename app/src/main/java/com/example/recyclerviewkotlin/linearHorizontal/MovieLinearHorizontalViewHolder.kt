package com.example.recyclerviewkotlin.linearHorizontal

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewkotlin.commons.Movie
import com.example.recyclerviewkotlin.databinding.ItemViewHolderMovieLinearHorizontalBinding
import kotlin.math.roundToInt

class MovieLinearHorizontalViewHolder(
    view: View
) : RecyclerView.ViewHolder(view) {

    private val binding = ItemViewHolderMovieLinearHorizontalBinding.bind(view)

    fun bind(model: Movie, onClickListener: MovieOnClickListener) {
        with(binding) {
            Glide.with(itemView).load(model.url).into(imageViewLinearHorizontalPrincipal)
            textViewLinearHorizontalTitle.text = model.title
            textViewLinearHorizontalYear.text = model.year.toString()
            textViewLinearHorizontalType.text= model.type.toString()
            root.setOnClickListener {
                onClickListener.onClick(model)
            }
        }
    }
}