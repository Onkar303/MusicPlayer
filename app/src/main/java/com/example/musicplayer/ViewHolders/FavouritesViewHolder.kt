package com.example.musicplayer.ViewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayer.R


class FavouritesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    var name: TextView = itemView.findViewById(R.id.musicText)

}