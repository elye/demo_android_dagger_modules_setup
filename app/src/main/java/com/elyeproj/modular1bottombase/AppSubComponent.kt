package com.elyeproj.modular1bottombase

import dagger.Subcomponent

@Subcomponent(modules = [AppDependentModule::class])
interface AppSubComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): AppSubComponent
    }
}
