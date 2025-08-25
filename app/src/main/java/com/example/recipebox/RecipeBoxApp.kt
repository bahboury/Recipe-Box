package com.example.recipebox

import android.app.Application
import com.example.recipebox.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class RecipeBoxApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Log Koin into Android logger
            androidLogger()
            // Reference Android context
            androidContext(this@RecipeBoxApp)
            // Load modules
            modules(appModules)
        }
    }
}