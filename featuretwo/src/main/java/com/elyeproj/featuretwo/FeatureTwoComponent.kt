package com.elyeproj.featuretwo

import com.elyeproj.base.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [FeatureTwoDependentModule::class])
interface FeatureTwoComponent {
    fun inject(featureOneActivity: FeatureTwoActivity)
}
