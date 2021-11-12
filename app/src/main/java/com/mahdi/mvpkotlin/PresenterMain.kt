package com.mahdi.mvpkotlin

class PresenterMain : PresenterBase.Presenter {

    var view : PresenterBase.View?



    constructor(view: PresenterBase.View) {
        this.view = view
    }



    override fun RunText() {
        view?.setText("welcome to here")
    }


}