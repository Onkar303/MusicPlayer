package com.example.musicplayer.Utils

import android.content.Context
import android.content.DialogInterface
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class CommonUtilities{

    companion object{
        fun alertDialog(context: Context,title:String,message:String)
        {

            val alertdialog = AlertDialog.Builder(context)
            alertdialog.setMessage(message)
            alertdialog.setTitle(title)
            alertdialog.setPositiveButton("ok", DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
            alertdialog.create().show()
        }


        fun myToastMessage(context: Context,message: String)
        {
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
        }

    }
}