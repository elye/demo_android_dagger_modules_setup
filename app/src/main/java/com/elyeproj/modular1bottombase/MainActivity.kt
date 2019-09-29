package com.elyeproj.modular1bottombase

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.elyeproj.base.BaseApplication
import com.elyeproj.featureone.FeatureOneActivity
import com.elyeproj.featuretwo.FeatureTwoActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appDependent: AppDependent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainComponent.builder()
            .baseComponent(BaseApplication.baseComponent)
            .appDependentModule(AppDependentModule("first", "last"))
            .build()
            .inject(this)

        txt_result.text = "I have get my dependents from\n$appDependent"

        button_one.setOnClickListener {
            startActivity(Intent(this, FeatureOneActivity::class.java))
        }

        button_two.setOnClickListener {
            startActivity(Intent(this, FeatureTwoActivity::class.java))
        }
    }
}
