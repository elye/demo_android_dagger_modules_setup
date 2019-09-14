package com.elyeproj.base

import android.app.Application

class BaseApplication: Application() {
    companion object {
        val baseComponent by lazy {
            DaggerBaseComponent.builder()
                .baseNetworkComponent(DaggerBaseNetworkComponent.create())
                .baseRepositoryComponent(DaggerBaseRepositoryComponent.create())
                .build()
        }
    }
}
