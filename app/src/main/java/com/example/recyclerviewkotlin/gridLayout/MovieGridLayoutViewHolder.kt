package com.example.recyclerviewkotlin.gridLayout

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewkotlin.commons.Movie
import com.example.recyclerviewkotlin.databinding.ItemViewHolderMovieGridLayoutBinding

class MovieGridLayoutViewHolder(
    view: View
) : RecyclerView.ViewHolder(view) {

    private val binding = ItemViewHolderMovieGridLayoutBinding.bind(view)

    fun bind(model: Movie, onClickListener: MovieOnClickListener) {
        with(binding) {
            Glide.with(itemView).load(model.url).into(imageViewLayoutGridPrincipal)
            textViewLayoutGridTitle.text = model.title
            textViewLayoutGridYear.text = model.year.toString()
            textViewLayoutGridType.text= model.type
            root.setOnClickListener {
                onClickListener.onClick(model)
            }
        }
    }
}