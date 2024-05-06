package com.example.cineasteapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class SearchFragment : Fragment() {
    private lateinit var searchText: EditText
    private lateinit var searchButton: ImageButton
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchMovies : MovieListAdapter
    private var searchMoviesAdapter = SearchMoviesAdapter(emptyList(), onItemClicked = {})
    private val scope = CoroutineScope(Job() + Dispatchers.Main)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        searchText = view.findViewById(R.id.searchText)
        searchButton = view.findViewById(R.id.searchButton)
        recyclerView = view.findViewById(R.id.searchResultsRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(activity, 2)
        searchMovies = MovieListAdapter(arrayListOf()){movie -> showMovieDetails(movie) }
        recyclerView.adapter = searchMovies
      //  searchMovies.updateMovies(emptyList())
        // Postavljanje slušaoca događaja na dugme za pretragu
        searchButton.setOnClickListener {
            onClick()
        }

        return view;
    }

    private fun showMovieDetails(movie: Movie) {
        val intent = Intent(activity, MovieDetailActivity::class.java).apply {
            putExtra("movie_title", movie.title)
        }
        startActivity(intent)
    }
    /* override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)
         arguments?.getString("search")?.let {
             searchText.setText(it)
         }
         view.findViewById<View>(R.id.searchButton).setOnClickListener {
             onClick()
         }
     }*/

    private fun onClick() {
        val toast = Toast.makeText(context, "Search start", Toast.LENGTH_SHORT)
        toast.show()
        search(searchText.text.toString())
    }
    fun search(query: String){
        val scope = CoroutineScope(Job() + Dispatchers.Main)
        // Kreira se Coroutine na UI
        scope.launch{
            // Vrti se poziv servisa i suspendira se rutina dok se `withContext` ne zavrsi
            val result = MovieRepository.searchRequest(query)
            // Prikaze se rezultat korisniku na glavnoj niti
            when (result) {
                is Result.Success<List<Movie>> -> searchDone(result.data)
                else-> onError()
            }
        }
    }
    fun searchDone(movies:List<Movie>){
        val toast = Toast.makeText(context, "Search done", Toast.LENGTH_SHORT)
        toast.show()
        Log.d("SearchFragment", "Retrieved movies: $movies")

        searchMovies.updateMovies(movies)
       // searchMoviesAdapter = SearchMoviesAdapter(movies = movies, onItemClicked = {})
        //searchMoviesAdapter.updateMovies(movies)
    }
    fun onError() {
        val toast = Toast.makeText(context, "Search error", Toast.LENGTH_SHORT)
        toast.show()
    }
}