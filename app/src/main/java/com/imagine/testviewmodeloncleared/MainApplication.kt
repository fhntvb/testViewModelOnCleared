package com.imagine.testviewmodeloncleared

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Use Koin Android Logger
            androidLogger()
            // declare Android context
            androidContext(this@MainApplication)
            // declare modules to use
            modules(appModule)
        }
    }
}