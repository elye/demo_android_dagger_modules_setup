package com.elyeproj.featureone

import dagger.Subcomponent

@Subcomponent(modules = [FeatureOneDependentModule::class])
interface FeatureOneSubComponent {

    fun inject(featureOneActivity: FeatureOneActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): FeatureOneSubComponent
    }
}
