package com.github.takahirom.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.takahirom.dagger.hilt.multimodule.sample.feature.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}