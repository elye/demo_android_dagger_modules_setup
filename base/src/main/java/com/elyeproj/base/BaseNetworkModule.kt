package com.elyeproj.base

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseNetworkModule {
    @Provides
    @Singleton
    fun baseNetworkModule() = BaseNetwork("from BaseNetworkModule")
}
