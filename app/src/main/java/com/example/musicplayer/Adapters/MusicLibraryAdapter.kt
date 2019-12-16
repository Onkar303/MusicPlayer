package com.example.musicplayer.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayer.Model.MusicLibraryModel
import com.example.musicplayer.R
import com.example.musicplayer.Utils.CommonUtilities
import com.example.musicplayer.ViewHolders.MusicLibraryViewHolder

class MusicLibraryAdapter(var context: Context,var musiclibrarylist:ArrayList<MusicLibraryModel> ): RecyclerView.Adapter<MusicLibraryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicLibraryViewHolder {

        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var v = inflater.inflate(R.layout.music_card,parent,false)
        return MusicLibraryViewHolder(v)


    }

    override fun getItemCount(): Int {
        return musiclibrarylist.size //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MusicLibraryViewHolder, position: Int) {
            holder.name.text = musiclibrarylist[position].name
            holder.itemView.setOnClickListener{v-> CommonUtilities.myToastMessage(context,"clicked") }
    }


}