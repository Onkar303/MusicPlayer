package com.example.musicplayer.Adapters

import android.content.Context
import android.service.autofill.CharSequenceTransformation
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.musicplayer.Fragments.FragmentModel

class MainActivityAdapter(fm: FragmentManager, behavior: Int,var context: Context,var list:ArrayList<FragmentModel>) : FragmentPagerAdapter(fm, behavior)
{


    override fun getItem(position: Int): Fragment {
        return list[position].fragment
    }

    override fun getCount(): Int {
        return list.size
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return list[position].tabName
    }
}