package com.example.musicplayer.Adapters

import android.content.Context
import android.service.autofill.CharSequenceTransformation
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainActivityAdapter(fm: FragmentManager, behavior: Int,var context: Context,var list:ArrayList<Fragment>) : FragmentPagerAdapter(fm, behavior)
{


    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return "onkar"
    }
}