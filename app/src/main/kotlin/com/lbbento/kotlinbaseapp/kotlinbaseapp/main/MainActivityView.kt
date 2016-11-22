package com.lbbento.kotlinbaseapp.kotlinbaseapp.main

import com.lbbento.kotlinbaseapp.kotlinbaseapp.view.BaseView

interface MainActivityView : BaseView {
    fun showToast(message: String)
}