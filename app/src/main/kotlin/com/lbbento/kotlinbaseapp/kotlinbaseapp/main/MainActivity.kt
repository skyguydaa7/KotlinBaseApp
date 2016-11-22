package com.lbbento.kotlinbaseapp.kotlinbaseapp.main

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import butterknife.ButterKnife
import com.lbbento.kotlinbaseapp.kotlinbaseapp.KotlinBaseAppApplication
import com.lbbento.kotlinbaseapp.kotlinbaseapp.R
import com.lbbento.kotlinbaseapp.kotlinbaseapp.view.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainActivityView {

    @Inject
    lateinit var context: Context

    @Inject
    lateinit var mainActivityPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)
        setupInjection()

        mainActivityPresenter.onAttach(this)
        mainActivityPresenter.onCreate()
    }

    override fun setupInjection() {
        (application as KotlinBaseAppApplication).component.inject(this)
    }

    override fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
