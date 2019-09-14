package com.elyeproj.modular1bottombase

import com.elyeproj.base.BaseComponent
import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository
import dagger.Component

@Component(dependencies = [BaseComponent::class])
interface MainComponent {
    val appSubComponentModelBuilder: AppSubComponentModel.Builder
}
