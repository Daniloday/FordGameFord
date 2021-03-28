package com.missclick.fordgame

import android.app.Application
import com.missclick.fordgame.dependencies.appMod
import com.missclick.fordgame.dependencies.dataMod
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(appMod, dataMod)
        }
    }
}