package com.elyeproj.modular1bottombase

import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository
import dagger.Module
import dagger.Provides

@Module
class AppDependentModule {
    @Provides
    fun appModel(baseRepository: BaseRepository, baseNetwork: BaseNetwork) =
        AppDependent("from AppDependentModule", baseRepository, baseNetwork)
}
