package com.example.gary.chooser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.util.*
import android.content.DialogInterface
import android.support.v7.app.AlertDialog



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun chooseItem(view: View) {
        val m = editText2.text
        val lines: List<String> = m.split( "\n" )
        val i = editText2.lineCount
        val j = (1..i).random()
        val k = lines.get(j - 1)

        val builder = AlertDialog.Builder(this)
        builder.setTitle("The choice is....")
        builder.setMessage(k)
        builder.setNegativeButton("OK",{ dialogInterface: DialogInterface, i: Int -> })
        builder.show()
    }

    fun ClosedRange<Int>.random() =
            Random().nextInt(endInclusive + 1 - start) + start




}
