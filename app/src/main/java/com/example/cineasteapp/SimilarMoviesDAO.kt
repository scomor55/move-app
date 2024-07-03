package com.example.cineasteapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Transaction

@Dao
interface SimilarMoviesDAO {
    @Insert(onConflict= OnConflictStrategy.IGNORE)
    suspend fun insert(join:SimilarMovies)

    @Transaction
    @Delete
    suspend fun deleteSimilar(join:SimilarMovies)

    @Transaction
    @Delete
    suspend fun deleteSimilarMovies(smovies:List<Movie>)

}