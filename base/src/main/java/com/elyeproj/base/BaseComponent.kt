package com.elyeproj.base

import dagger.Component

@Component(dependencies = [BaseNetworkComponent::class, BaseRepositoryComponent::class])
interface BaseComponent {
    val baseNetwork: BaseNetwork
    val baseRepository: BaseRepository
}
