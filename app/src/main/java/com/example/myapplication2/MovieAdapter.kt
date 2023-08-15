package com.example.myapplication2

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(var list : ArrayList<movie>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.movie_item , parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.setImage(list[position])
    }

    inner class MovieViewHolder(var view: View) : RecyclerView.ViewHolder(view){

        fun setImage(movie : movie){
            var image = view.findViewById<ImageView>(R.id.item_image)

            if(movie.title =="superman"){
                image.setImageResource(R.drawable.superman)
            }else if(movie.title =="wonderwoman"){
                image.setImageResource(R.drawable.wonderwoman)

            }else if(movie.title =="avengers"){
                image.setImageResource(R.drawable.avengers)
            }else{
                image.setImageResource(R.drawable.batman)

            }

        }

    }

}