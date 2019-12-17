package com.example.musicplayer.Utils

import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.view.LayoutInflater
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import com.example.musicplayer.R

class CommonUtilities{

    companion object{
        @RequiresApi(Build.VERSION_CODES.M)
        fun alertDialog(context: Context, title:String, message:String)
        {

            val alertdialog = AlertDialog.Builder(context)
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.music_option_layout,null)
            alertdialog.setView(view)
            val dialog = alertdialog.create()
            dialog.show()
            dialog.window?.setWindowAnimations(R.style.AppTheme)
            dialog.window?.setBackgroundDrawable(ColorDrawable(context.getColor(android.R.color.transparent)))
        }


        fun myToastMessage(context: Context,message: String)
        {
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
        }

    }
}