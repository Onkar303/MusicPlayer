package com.example.musicplayer.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayer.Model.FavouritesModel
import com.example.musicplayer.R
import com.example.musicplayer.ViewHolders.FavouritesViewHolder
import com.example.musicplayer.ViewHolders.MusicLibraryViewHolder

class FavouritesAdapter(var context: Context,var list:ArrayList<FavouritesModel>):RecyclerView.Adapter<FavouritesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouritesViewHolder {

        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var v = inflater.inflate(R.layout.musiclibrarycard,parent,false)
        return FavouritesViewHolder(v)


    }

    override fun getItemCount(): Int {
        return list.size //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: FavouritesViewHolder, position: Int) {

    }




}