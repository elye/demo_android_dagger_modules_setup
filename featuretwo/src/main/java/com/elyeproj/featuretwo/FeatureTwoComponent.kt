package com.elyeproj.featuretwo

import com.elyeproj.base.BaseComponent
import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository
import dagger.Component

@Component(dependencies = [BaseComponent::class])
interface FeatureTwoComponent {
    val featureTwoSubComponentModelBuilder: FeatureTwoSubComponent.Builder
}
