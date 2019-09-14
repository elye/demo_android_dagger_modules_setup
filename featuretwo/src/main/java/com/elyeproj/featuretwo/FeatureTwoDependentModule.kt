package com.elyeproj.featuretwo

import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository
import dagger.Module
import dagger.Provides

@Module
class FeatureTwoDependentModule {
    @Provides
    fun appModel(baseRepository: BaseRepository, baseNetwork: BaseNetwork) =
        FeatureTwoDependent("from FeatureOneDependentModule", baseRepository, baseNetwork)
}
