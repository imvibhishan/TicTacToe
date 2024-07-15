package com.appdev.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private var tapCount: Int =0
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView
    private lateinit var imageView4: ImageView
    private lateinit var imageView5: ImageView
    private lateinit var imageView6: ImageView
    private lateinit var imageView7: ImageView
    private lateinit var imageView8: ImageView
    private lateinit var imageView9: ImageView
    private lateinit var imageView10: ImageView
    private lateinit var imageView11: ImageView
    private lateinit var imageView12: ImageView
    private lateinit var imageView13: ImageView
    private lateinit var imageView14: ImageView
    private lateinit var imageView15: ImageView
    private lateinit var imageView16: ImageView
    private lateinit var imageView17: ImageView
    private lateinit var imageView18: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView1 = findViewById(R.id.act1image10)
        imageView2 = findViewById(R.id.act1image11)
        imageView3 = findViewById(R.id.act1image12)
        imageView4 = findViewById(R.id.act1image13)
        imageView5 = findViewById(R.id.act1image14)
        imageView6 = findViewById(R.id.act1image15)
        imageView7 = findViewById(R.id.act1image16)
        imageView8 = findViewById(R.id.act1image17)
        imageView9 = findViewById(R.id.act1image18)
        imageView10 = findViewById(R.id.act1image19)
        imageView11 = findViewById(R.id.act1image20)
        imageView12 = findViewById(R.id.act1image21)
        imageView13 = findViewById(R.id.act1image22)
        imageView14 = findViewById(R.id.act1image23)
        imageView15 = findViewById(R.id.act1image24)
        imageView16 = findViewById(R.id.act1image25)
        imageView17 = findViewById(R.id.act1image26)
        imageView18 = findViewById(R.id.act1image27)

    }

    fun visible1(view: View) {
        if(imageView1.visibility == View.INVISIBLE && imageView10.visibility == View.INVISIBLE){
            tapCount +=1
            if(tapCount%2 == 1) {
                imageView10.visibility = View.VISIBLE
            }
            else
                imageView1.visibility = View.VISIBLE
            checkStraightLIne()
        }
        if(tapCount == 9)
            restartActivity()
    }
    fun visible2(view: View) {
        if(imageView2.visibility == View.INVISIBLE && imageView11.visibility == View.INVISIBLE){
            tapCount +=1
            if(tapCount%2 == 1)
                imageView11.visibility = View.VISIBLE
            else
                imageView2.visibility = View.VISIBLE
            checkStraightLIne()
        }
        if(tapCount == 9)
            restartActivity()
    }
    fun visible3(view: View) {
        if(imageView3.visibility == View.INVISIBLE && imageView12.visibility == View.INVISIBLE){
            tapCount +=1
            if(tapCount%2 == 1)
                imageView12.visibility = View.VISIBLE
            else
                imageView3.visibility = View.VISIBLE
            checkStraightLIne()
        }
        if(tapCount == 9)
            restartActivity()
    }
    fun visible4(view: View) {
        if(imageView4.visibility == View.INVISIBLE && imageView13.visibility == View.INVISIBLE){
            tapCount +=1
            if(tapCount%2 == 1)
                imageView13.visibility = View.VISIBLE
            else
                imageView4.visibility = View.VISIBLE
            checkStraightLIne()
        }
        if(tapCount == 9)
            restartActivity()
    }
    fun visible5(view: View) {
        if(imageView5.visibility == View.INVISIBLE && imageView14.visibility == View.INVISIBLE){
            tapCount +=1
            if(tapCount%2 == 1)
                imageView14.visibility = View.VISIBLE
            else
                imageView5.visibility = View.VISIBLE
            checkStraightLIne()
        }
        if(tapCount == 9)
            restartActivity()
    }
    fun visible6(view: View) {
        if(imageView6.visibility == View.INVISIBLE && imageView15.visibility == View.INVISIBLE){
            tapCount +=1
            if(tapCount%2 == 1)
                imageView15.visibility = View.VISIBLE
            else
                imageView6.visibility = View.VISIBLE
            checkStraightLIne()
        }
        if(tapCount == 9)
            restartActivity()
    }
    fun visible7(view: View) {
        if(imageView7.visibility == View.INVISIBLE && imageView16.visibility == View.INVISIBLE){
            tapCount +=1
            if(tapCount%2 == 1)
                imageView16.visibility = View.VISIBLE
            else
                imageView7.visibility = View.VISIBLE
            checkStraightLIne()
        }
        if(tapCount == 9)
            restartActivity()
    }
    fun visible8(view: View) {
        if(imageView8.visibility == View.INVISIBLE && imageView17.visibility == View.INVISIBLE){
            tapCount +=1
            if(tapCount%2 == 1)
                imageView17.visibility = View.VISIBLE
            else
                imageView8.visibility = View.VISIBLE
            checkStraightLIne()
        }
        if(tapCount == 9)
            restartActivity()
    }
    fun visible9(view: View) {
        if(imageView9.visibility == View.INVISIBLE && imageView18.visibility == View.INVISIBLE){
            tapCount +=1
            if(tapCount%2 == 1)
                imageView18.visibility = View.VISIBLE
            else
                imageView9.visibility = View.VISIBLE
            checkStraightLIne()
        }
        if(tapCount == 9)
            restartActivity()
    }

    private fun checkStraightLIne() {
        if((imageView1.visibility == View.VISIBLE && imageView2.visibility == View.VISIBLE && imageView3.visibility == View.VISIBLE)||(imageView10.visibility == View.VISIBLE && imageView11.visibility == View.VISIBLE && imageView12.visibility == View.VISIBLE)){
            findViewById<View>(R.id.divider2).visibility = View.VISIBLE
            restartActivity()
        }
        else if((imageView4.visibility == View.VISIBLE && imageView5.visibility == View.VISIBLE && imageView6.visibility == View.VISIBLE)||(imageView13.visibility == View.VISIBLE && imageView14.visibility == View.VISIBLE && imageView15.visibility == View.VISIBLE)){
            findViewById<View>(R.id.divider3).visibility = View.VISIBLE
            restartActivity()
        }
        else if((imageView7.visibility == View.VISIBLE && imageView8.visibility == View.VISIBLE && imageView9.visibility == View.VISIBLE)||(imageView16.visibility == View.VISIBLE && imageView17.visibility == View.VISIBLE && imageView18.visibility == View.VISIBLE)){
            findViewById<View>(R.id.divider4).visibility = View.VISIBLE
            restartActivity()
        }
        else if((imageView1.visibility == View.VISIBLE && imageView4.visibility == View.VISIBLE && imageView7.visibility == View.VISIBLE)||(imageView10.visibility == View.VISIBLE && imageView13.visibility == View.VISIBLE && imageView16.visibility == View.VISIBLE)){
            findViewById<View>(R.id.divider5).visibility = View.VISIBLE
            restartActivity()
        }
        else if((imageView2.visibility == View.VISIBLE && imageView5.visibility == View.VISIBLE && imageView8.visibility == View.VISIBLE)||(imageView11.visibility == View.VISIBLE && imageView14.visibility == View.VISIBLE && imageView17.visibility == View.VISIBLE)){
            findViewById<View>(R.id.divider6).visibility = View.VISIBLE
            restartActivity()
        }
        else if((imageView3.visibility == View.VISIBLE && imageView6.visibility == View.VISIBLE && imageView9.visibility == View.VISIBLE)||(imageView12.visibility == View.VISIBLE && imageView15.visibility == View.VISIBLE && imageView18.visibility == View.VISIBLE)){
            findViewById<View>(R.id.divider7).visibility = View.VISIBLE
            restartActivity()
        }
        else if((imageView1.visibility == View.VISIBLE && imageView5.visibility == View.VISIBLE && imageView9.visibility == View.VISIBLE)||(imageView10.visibility == View.VISIBLE && imageView14.visibility == View.VISIBLE && imageView18.visibility == View.VISIBLE)){
            findViewById<View>(R.id.divider8).visibility = View.VISIBLE
            restartActivity()
        }
        else if((imageView3.visibility == View.VISIBLE && imageView5.visibility == View.VISIBLE && imageView7.visibility == View.VISIBLE)||(imageView12.visibility == View.VISIBLE && imageView14.visibility == View.VISIBLE && imageView16.visibility == View.VISIBLE)){
            findViewById<View>(R.id.divider9).visibility = View.VISIBLE
            restartActivity()
        }
    }

    private fun restartActivity() {
        val intent = intent
        finish()
        startActivity(intent)
    }
}