package com.lbbento.kotlinbaseapp.kotlinbaseapp

import android.app.Application
import com.lbbento.kotlinbaseapp.kotlinbaseapp.di.AppComponent
import com.lbbento.kotlinbaseapp.kotlinbaseapp.di.AppModule
import com.lbbento.kotlinbaseapp.kotlinbaseapp.di.DaggerAppComponent

open class KotlinBaseAppApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
        component.inject(this)
    }
}