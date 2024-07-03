package com.example.cineasteapp

import androidx.room.Entity

@Entity(primaryKeys = ["movieId","similarMovieId"])
data class SimilarMovies(
    val movieId:Long,
    val similarMovieId:Long
){

}