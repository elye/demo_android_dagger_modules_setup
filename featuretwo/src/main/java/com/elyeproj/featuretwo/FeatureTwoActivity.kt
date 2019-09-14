package com.elyeproj.featuretwo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.elyeproj.base.BaseApplication
import kotlinx.android.synthetic.main.activity_feature_two.*
import javax.inject.Inject

class FeatureTwoActivity : AppCompatActivity() {

    @Inject
    lateinit var featureTwoDependent: FeatureTwoDependent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)

        DaggerFeatureTwoComponent.builder()
            .baseComponent(BaseApplication.baseComponent)
            .build()
            .featureTwoSubComponentModelBuilder.build()
            .inject(this)

        txt_result.text = "I have get my dependents from\n$featureTwoDependent"
    }
}
