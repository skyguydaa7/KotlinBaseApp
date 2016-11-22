package com.lbbento.kotlinbaseapp.kotlinbaseapp.di

import com.lbbento.kotlinbaseapp.kotlinbaseapp.KotlinBaseAppApplication
import com.lbbento.kotlinbaseapp.kotlinbaseapp.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(kotlinBaseAppApplication: KotlinBaseAppApplication)
    fun inject(mainActivity: MainActivity)
}