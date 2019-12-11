package com.exercise.earthquakes

import android.app.Application

class EQApplication : Application() {

    companion object {
        private lateinit var app: EQApplication

        fun getApplication(): EQApplication {
            return app
        }
    }

    override fun onCreate() {
        super.onCreate()

        app = this
    }
}