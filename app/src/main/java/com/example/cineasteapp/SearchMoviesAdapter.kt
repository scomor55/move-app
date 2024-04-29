package com.example.cineasteapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchMoviesAdapter(
    private var movies: List<Movie>,
    private val onItemClicked: (movie: Movie) -> Unit
) : RecyclerView.Adapter<SearchMoviesAdapter.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    fun updateMovies(movies: List<Movie>) {
        this.movies = movies
        notifyDataSetChanged()
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val movieImage: ImageView = itemView.findViewById(R.id.movieImage)
        private val movieTitle: TextView = itemView.findViewById(R.id.movieTitle)

        fun bind(movie: Movie) {
            movieTitle.text = movie.title

            // Your logic for setting genre image goes here
            // For example:
            // val genreMatch: String? = movie.genre
            // val context: Context = itemView.context
            // val id: Int = context.resources.getIdentifier(genreMatch, "drawable", context.packageName)
            // movieImage.setImageResource(id)

            itemView.setOnClickListener { onItemClicked(movie) }
        }
    }
}