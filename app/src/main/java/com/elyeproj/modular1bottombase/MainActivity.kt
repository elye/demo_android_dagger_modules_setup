package com.elyeproj.modular1bottombase

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.elyeproj.base.BaseApplication
import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appModel: AppModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainComponent.builder()
            .baseComponent(BaseApplication.baseComponent)
            .build()
            .appSubComponentModelBuilder.build()
            .inject(this)

        txt_result.text = "I have get my dependents from\n$appModel"
    }
}
