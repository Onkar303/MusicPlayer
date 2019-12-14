package com.example.musicplayer.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayer.Adapters.MusicLibraryAdapter
import com.example.musicplayer.Model.MusicLibraryModel
import com.example.musicplayer.R

class MusicLibrary :Fragment(){

    lateinit var musicList:RecyclerView
    lateinit var musicadapter:MusicLibraryAdapter
    lateinit var list:ArrayList<MusicLibraryModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.musiclibrary,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inititalization(view)

    }


    fun inititalization(view:View){
        musicList = view.findViewById(R.id.musiclibrarylist)
        musicList.layoutManager = LinearLayoutManager(context);
        list = ArrayList<MusicLibraryModel>()

        for (i in 1..10)
        {
            list.add(MusicLibraryModel("onkar ${i}"))
        }


        musicadapter = MusicLibraryAdapter(activity!!,list)

        musicList.adapter=musicadapter

    }
}