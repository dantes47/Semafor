package com.elmob.semafor

import android.os.Bundle
import android.app.Activity
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {
    private var imgSemafor: ImageView? = null
    var imgArray: IntArray = intArrayOf(
        R.drawable.semafor_red,
        R.drawable.semafor_yellow,
        R.drawable.semafor_green
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgSemafor = findViewById(R.id.imgSemafor)
        imgSemafor?.setImageResource(imgArray[0])
    }

    fun onClickRunStop(view: View) {
        // making a cast
        view as ImageButton
        view.setImageResource(R.drawable.button_stop)
    }
}