package com.example.musicplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.musicplayer.Adapters.MainActivityAdapter
import com.example.musicplayer.Fragments.Favourites
import com.example.musicplayer.Fragments.FragmentModel
import com.example.musicplayer.Fragments.MusicLibrary
import com.example.musicplayer.Fragments.PlayLists
import com.example.musicplayer.Utils.CommonUtilities
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener,NavigationView.OnNavigationItemSelectedListener {

    lateinit var tabBar:TabLayout
    lateinit var viewPager:ViewPager
    lateinit var viewPagerAdaper:MainActivityAdapter
    lateinit var screens:ArrayList<FragmentModel>
    lateinit var fab:FloatingActionButton
    lateinit var navigationView:NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialization()
    }



    fun initialization(){

        viewPager=findViewById(R.id.viewPager)
        tabBar = findViewById(R.id.tabBar)
        fab = findViewById(R.id.fab);
        navigationView=findViewById(R.id.naviagtionView)
        navigationView.setNavigationItemSelectedListener(this)
        fab.setOnClickListener(this)



        screens = ArrayList()

        screens.add(FragmentModel(MusicLibrary(),"Music"))
        screens.add(FragmentModel(Favourites(),"Favourites"))
        screens.add(FragmentModel(PlayLists(),"PlayLists"))

        viewPagerAdaper = MainActivityAdapter(supportFragmentManager,1,this,screens)


        viewPager.adapter = viewPagerAdaper


        tabBar.setupWithViewPager(viewPager)

    }

    override fun onClick(v: View?) {

        when(v?.id)
        {
            R.id.fab -> CommonUtilities.alertDialog(this,"Alert!","this is an alertDialog")
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
      when(item.itemId)
      {

          R.id.AboutId -> {}
          R.id.ShareId ->{}
          R.id.developerId ->{startActivity(Intent(this,Developer::class.java))}
          R.id.ExitId ->  finish()

      }
        return true
    }


}
