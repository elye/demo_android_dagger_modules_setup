package com.elyeproj.modular1bottombase

import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository

class AppModel(val name: String, private val baseRepository: BaseRepository, private val baseNetwork: BaseNetwork) {
    override fun toString(): String {
        return "AppModel $name\n$baseRepository\n$baseNetwork"
    }
}
