package com.example.basesetup.application

import android.app.Activity
import android.app.Application
import com.example.basesetup.application.di.DaggerAppComponent
import com.facebook.stetho.Stetho
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class BaseSetUpApp : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
            .builder()
            .application(this)
            .build()
            .inject(this)

        Stetho.initializeWithDefaults(this)
    }


    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

}
