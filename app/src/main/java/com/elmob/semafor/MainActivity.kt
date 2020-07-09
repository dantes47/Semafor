package com.elmob.semafor

import android.os.Bundle
import android.app.Activity
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {
    private var imgSemafor: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgSemafor = findViewById(R.id.imgSemafor)
    }

    fun onClickRunStop(view: View) {
        imgSemafor?.setImageResource(R.drawable.semafor_green)
    }
}