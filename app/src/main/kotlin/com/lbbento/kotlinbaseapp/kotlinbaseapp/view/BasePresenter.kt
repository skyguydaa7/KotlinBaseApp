package com.lbbento.kotlinbaseapp.kotlinbaseapp.view

abstract class BasePresenter<V : BaseView> {

    lateinit var view: V

    open fun onAttach(view: V) {
        this.view = view
    }

    abstract fun onCreate()
}