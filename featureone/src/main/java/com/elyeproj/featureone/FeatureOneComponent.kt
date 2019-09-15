package com.elyeproj.featureone

import com.elyeproj.base.ActivityScope
import com.elyeproj.base.BaseComponent
import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository
import dagger.Component

@ActivityScope
@Component(dependencies = [BaseComponent::class], modules = [FeatureOneDependentModule::class])
interface FeatureOneComponent {
    fun inject(featureOneActivity: FeatureOneActivity)
}
