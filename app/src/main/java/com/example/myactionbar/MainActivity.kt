package com.example.myactionbar

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_toolbar.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tool:androidx.appcompat.widget.Toolbar=findViewById(R.id.main)
        tool.setTitle("Action Bar")
        tool.inflateMenu(R.menu.activity_menu)
        tool.setOnMenuItemClickListener {

            when(it.itemId){
                R.id.download->{
                    Toast.makeText(this,"Download",Toast.LENGTH_SHORT).show()

                }
                R.id.print ->{
                    Toast.makeText(this,"Print",Toast.LENGTH_SHORT).show()

                }
            }
            true
        }



    }
}