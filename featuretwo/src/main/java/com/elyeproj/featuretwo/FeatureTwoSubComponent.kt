package com.elyeproj.featuretwo

import dagger.Subcomponent

@Subcomponent(modules = [FeatureTwoDependentModule::class])
interface FeatureTwoSubComponent {

    fun inject(featureOneActivity: FeatureTwoActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): FeatureTwoSubComponent
    }
}
