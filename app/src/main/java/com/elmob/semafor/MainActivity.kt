package com.elmob.semafor

import android.os.Bundle
import android.app.Activity
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import java.util.*

class MainActivity : Activity() {
    var imgSemafor: ImageView? = null
    var i: Int = 0
    var timer: Timer? = null
    var isRun = false
    var imgArray: IntArray = intArrayOf (
        R.drawable.semafor_red,
        R.drawable.semafor_yellow,
        R.drawable.semafor_green
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgSemafor = findViewById(R.id.imgSemafor)
    }

    fun onClickRunStop(view: View) {

        // making a cast
        view as ImageButton
        if(!isRun) {

            runStop()
            view.setImageResource(R.drawable.button_stop)
            isRun = true
        } else {
            imgSemafor?.setImageResource(R.drawable.semafor_grey)
            view.setImageResource(R.drawable.button_start)
            timer?.cancel()
            isRun = false
            i = 0
        }

    }
        fun runStop() {
                timer = Timer()
                timer?.schedule(object : TimerTask() {
                    override fun run() {

                        // adding path to main thread for proper running
                        runOnUiThread() {
                            imgSemafor?.setImageResource(imgArray[i])
                            i++
                            if (i == 3) i = 0
                        }
                    }

                }, 0, 1000)
        }
}