package com.github.takahirom.dagger.hilt.multimodule.sample

import com.github.takahirom.feature.AppHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {

  @Provides
  @AppHash
  fun provideHash(): String {
      return hashCode().toString()
  }
}