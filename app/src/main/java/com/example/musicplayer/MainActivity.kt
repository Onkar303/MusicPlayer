package com.example.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.musicplayer.Adapters.MainActivityAdapter
import com.example.musicplayer.Fragments.Favourites
import com.example.musicplayer.Fragments.MusicLibrary
import com.example.musicplayer.Fragments.PlayLists
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var tabBar:TabLayout
    lateinit var viewPager:ViewPager
    lateinit var viewPagerAdaper:MainActivityAdapter
    lateinit var screens:ArrayList<Fragment>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialization()
    }



    fun initialization(){

        viewPager=findViewById(R.id.viewPager)
        tabBar = findViewById(R.id.tabBar)

        screens = ArrayList<Fragment>()

        screens.add(MusicLibrary())
        screens.add(Favourites())
        screens.add(PlayLists())

        viewPagerAdaper = MainActivityAdapter(supportFragmentManager,1,this,screens)


        viewPager.adapter = viewPagerAdaper


        tabBar.setupWithViewPager(viewPager)

    }




}
