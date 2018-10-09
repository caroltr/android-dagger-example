package com.raywenderlich.android.droidwiki.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by caroltr on 07/10/2018.
 */

// This class will provide dependencies
@Module
class AppModule(private val app: Application) {

    @Provides // this method provides the context dependency
    @Singleton
    fun provideContext(): Context = app
}