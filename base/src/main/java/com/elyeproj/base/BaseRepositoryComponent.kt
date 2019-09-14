package com.elyeproj.base

import dagger.Component

@Component(modules = [BaseRepositoryModule::class])
interface BaseRepositoryComponent {
    val baseRepository: BaseRepository

    @Component.Builder
    interface Builder {
        fun build(): BaseRepositoryComponent
    }
}
