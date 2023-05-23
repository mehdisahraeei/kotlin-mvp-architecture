package com.mahdi.mvpkotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity : AppCompatActivity(),PresenterBase.View {



    var present: PresenterMain? = null
    lateinit var textview : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//------------------------------------------------------------------------
        textview = findViewById(R.id.textone)
        present = PresenterMain(this)
//------------------------------------------------------------------------

        present?.RunText()
    }



    override fun setText(name: String) {
        textview.setText(name)
    }


}