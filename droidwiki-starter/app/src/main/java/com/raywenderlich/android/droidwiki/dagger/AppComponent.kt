package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by caroltr on 07/10/2018.
 */

@Singleton
@Component(modules = [AppModule::class, PresenterModule::class])
interface AppComponent {
    fun inject(target: HomepageActivity) //HomepageActivity class will require injection from AppComponent.
}