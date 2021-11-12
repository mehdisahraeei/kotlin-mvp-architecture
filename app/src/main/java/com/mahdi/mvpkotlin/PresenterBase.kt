package com.mahdi.mvpkotlin

interface PresenterBase {


    interface View
    {
        fun setText(name : String)
    }



    interface Presenter
    {
        fun RunText()
    }


}