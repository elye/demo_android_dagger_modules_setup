package com.elyeproj.base

import dagger.Module
import dagger.Provides

@Module
class BaseRepositoryModule {
    @Provides
    fun baseRepository() = BaseRepository("from BaseRepositoryModule")
}
