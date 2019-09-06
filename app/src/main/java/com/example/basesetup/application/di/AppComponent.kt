package com.example.basesetup.application.di

import android.app.Application
import com.example.basesetup.application.BaseSetUpApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [],
    modules = [AndroidSupportInjectionModule::class]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: BaseSetUpApp)
}