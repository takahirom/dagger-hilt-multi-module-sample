package com.github.takahirom.feature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.takahirom.dagger.hilt.multimodule.sample.feature.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @AppHash
    @Inject
    lateinit var hash: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("hash:"+hash)
    }
}