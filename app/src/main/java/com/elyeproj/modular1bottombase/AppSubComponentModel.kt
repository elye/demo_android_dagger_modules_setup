package com.elyeproj.modular1bottombase

import com.elyeproj.base.ActivityScope
import dagger.Subcomponent

@Subcomponent(modules = [AppModelModule::class])
interface AppSubComponentModel {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): AppSubComponentModel
    }
}
