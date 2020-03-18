package com.elyeproj.modular1bottombase

import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppDependentModule(private val prefix: String, private val postfix: String) {

    @Provides @Named("prefix")
    fun getPrefixText() = prefix

    @Provides @Named("postfix")
    fun getPostfixText() = postfix

    @Singleton
    @Provides
    fun provideBaseRepository() = BaseRepository("from AppDependentModule")

    @Singleton
    @Provides
    fun provideBaseNetwork() = BaseNetwork("from AppDependentModule")

    @Provides
    fun appModel(@Named("prefix") prefix: String,
                 @Named("postfix") postfix: String,
                 baseRepository: BaseRepository, baseNetwork: BaseNetwork) =
        AppDependent("$prefix $postfix", baseRepository, baseNetwork)
}
