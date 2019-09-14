package com.elyeproj.base

import dagger.Component

@Component(modules = [BaseNetworkModule::class])
interface BaseNetworkComponent {

    val baseNetwork: BaseNetwork

    @Component.Builder
    interface Builder {
        fun build(): BaseNetworkComponent
    }
}
