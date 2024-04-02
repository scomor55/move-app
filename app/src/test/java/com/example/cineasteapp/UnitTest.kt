package com.example.cineasteapp

import junit.framework.TestCase.assertEquals
import org.hamcrest.CoreMatchers.hasItem
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.not
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.hasProperty
import org.junit.Test

class UnitTest {
    @Test
    fun testGetFavoriteMovies(){
        val movies = getFavoriteMovies()
        assertEquals(movies.size, 4)
        assertThat(
            movies,
            hasItem<Movie>(
                hasProperty(
                    "title",
                    `is`("Johnny English Strikes Again")
                )
            )
        )
        assertThat(
            movies,
            not(
                hasItem<Movie>(
                    hasProperty(
                        "title",
                        `is`("Johnny English Doesn't Strike Again")
                    )
                )
            )
        )
    }
}