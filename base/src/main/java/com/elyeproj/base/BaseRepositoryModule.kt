package com.elyeproj.base

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseRepositoryModule {
    @Provides
    @Singleton
    fun baseRepository() = BaseRepository("from BaseRepositoryModule")
}
