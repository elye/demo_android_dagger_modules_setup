package com.elyeproj.base

import dagger.Module
import dagger.Provides

@Module
class BaseNetworkModule {
    @Provides
    fun baseNetworkModule() = BaseNetwork("from BaseNetworkModule")
}
