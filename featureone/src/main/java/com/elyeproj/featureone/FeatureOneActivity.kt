package com.elyeproj.featureone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_feature_one.*
import javax.inject.Inject

class FeatureOneActivity : AppCompatActivity() {

    @Inject
    lateinit var featureOneDependent: FeatureOneDependent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)

        (application as FeatureOneApplication).getFeatureOneComponent()
            .inject(this)

        txt_result.text = "I have get my dependents from\n$featureOneDependent"
    }
}

interface FeatureOneApplication {
    fun getFeatureOneComponent() : FeatureOneComponent
}
