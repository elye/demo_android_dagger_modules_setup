package com.elyeproj.modular1bottombase

import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository
import dagger.Module
import dagger.Provides

@Module
class AppModelModule {
    @Provides
    fun appModel(baseRepository: BaseRepository, baseNetwork: BaseNetwork) =
        AppModel("from AppModelModule", baseRepository, baseNetwork)
}
