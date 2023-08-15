package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var movieList : ArrayList<movie> = ArrayList()
        movieList.add(movie("avengers"))
        movieList.add(movie("batman"))
        movieList.add(movie("wonderwoman"))
        movieList.add(movie("superman"))

        var adapter = MovieAdapter(movieList)

        var recyclerView = findViewById<RecyclerView>(R.id.movie_recycler_view)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
}