package com.elyeproj.featureone

import com.elyeproj.base.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [FeatureOneDependentModule::class])
interface FeatureOneComponent {
    fun inject(featureOneActivity: FeatureOneActivity)
}
