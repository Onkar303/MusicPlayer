package com.example.musicplayer.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayer.Model.PlayListModel
import com.example.musicplayer.R
import com.example.musicplayer.Utils.CommonUtilities
import com.example.musicplayer.ViewHolders.PlayListViewHolder

class PlayListsAdapter(var context: Context,var list:ArrayList<PlayListModel>) : RecyclerView.Adapter<PlayListViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayListViewHolder {

        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var v = inflater.inflate(R.layout.music_card,parent,false)
        return PlayListViewHolder(v)


    }

    override fun getItemCount(): Int {
        return list.size //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: PlayListViewHolder, position: Int) {

        holder.name.text = list[position].name


    }


}