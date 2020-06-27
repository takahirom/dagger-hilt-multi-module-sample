## module graph

app -> feature

##  app module

```
apply dagger.hilt.android.plugin

dependencies {
    implementation 'com.google.dagger:hilt-android:2.28-alpha'
    kapt 'com.google.dagger:hilt-android-compiler:2.28-alpha'

    implementation 'androidx.hilt:hilt-common:1.0.0-SNAPSHOT'
    implementation 'androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-SNAPSHOT'
    kapt 'androidx.hilt:hilt-compiler:1.0.0-SNAPSHOT'
}
```

## feature module

```
apply dagger.hilt.android.plugin
dependencies {
    implementation 'com.google.dagger:hilt-android:2.28-alpha'
    kapt 'com.google.dagger:hilt-android-compiler:2.28-alpha'

    implementation 'androidx.hilt:hilt-common:1.0.0-SNAPSHOT'
    implementation 'androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-SNAPSHOT'
    kapt 'androidx.hilt:hilt-compiler:1.0.0-SNAPSHOT'
}
```
