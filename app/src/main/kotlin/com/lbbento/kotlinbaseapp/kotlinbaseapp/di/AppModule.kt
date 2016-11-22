package com.lbbento.kotlinbaseapp.kotlinbaseapp.di

import android.content.Context
import com.lbbento.kotlinbaseapp.kotlinbaseapp.KotlinBaseAppApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: KotlinBaseAppApplication) {
    @Provides fun provideContext(): Context = context
}