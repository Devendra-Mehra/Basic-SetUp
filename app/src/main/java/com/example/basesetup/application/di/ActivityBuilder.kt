package com.example.basesetup.application.di

import com.example.basesetup.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    internal abstract fun contributeMainActivityInjector(): MainActivity
}