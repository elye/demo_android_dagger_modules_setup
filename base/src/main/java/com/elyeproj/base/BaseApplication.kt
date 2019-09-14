package com.elyeproj.base

import android.app.Application

class BaseApplication: Application() {
    companion object {
        val baseComponent by lazy {
            DaggerBaseComponent.create()
        }
    }
}
