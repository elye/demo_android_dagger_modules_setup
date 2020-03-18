package com.elyeproj.modular1bottombase

import android.app.Application
import com.elyeproj.featureone.FeatureOneApplication
import com.elyeproj.featureone.FeatureOneComponent
import com.elyeproj.featuretwo.FeatureTwoApplication
import com.elyeproj.featuretwo.FeatureTwoComponent

class MainApplication: Application(), FeatureOneApplication, FeatureTwoApplication {
    val component = DaggerMainComponent.builder()
        .appDependentModule(AppDependentModule("first", "last"))
        .build()


    override fun getFeatureOneComponent(): FeatureOneComponent {
        return component.getFeatureOneComponent()
    }

    override fun getFeatureTwoComponent(): FeatureTwoComponent {
        return component.getFeatureTwoComponent()
    }
}
