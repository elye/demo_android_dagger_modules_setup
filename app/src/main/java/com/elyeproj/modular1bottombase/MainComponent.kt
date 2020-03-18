package com.elyeproj.modular1bottombase

import com.elyeproj.base.ActivityScope
import com.elyeproj.featureone.FeatureOneApplication
import com.elyeproj.featureone.FeatureOneComponent
import com.elyeproj.featuretwo.FeatureTwoApplication
import com.elyeproj.featuretwo.FeatureTwoComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppDependentModule::class])
interface MainComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): MainComponent
        fun appDependentModule(appDependentModule: AppDependentModule): Builder
    }

    fun getFeatureOneComponent(): FeatureOneComponent

    fun getFeatureTwoComponent(): FeatureTwoComponent
}
