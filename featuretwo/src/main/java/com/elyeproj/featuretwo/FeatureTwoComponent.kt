package com.elyeproj.featuretwo

import com.elyeproj.base.ActivityScope
import com.elyeproj.base.BaseComponent
import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository
import dagger.Component

@ActivityScope
@Component(dependencies = [BaseComponent::class], modules = [FeatureTwoDependentModule::class])
interface FeatureTwoComponent {
    fun inject(featureOneActivity: FeatureTwoActivity)
}
