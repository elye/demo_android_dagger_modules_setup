package com.elyeproj.modular1bottombase

import com.elyeproj.base.BaseComponent
import dagger.Component

@Component(dependencies = [BaseComponent::class])
interface MainComponent {
    val appSubComponentBuilder: AppSubComponent.Builder
}
