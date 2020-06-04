Not working now

```
2020-06-04 10:26:08.395 6285-6285/? D/AndroidRuntime: Shutting down VM
2020-06-04 10:26:08.395 6285-6285/? E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.github.takahirom.dagger.hilt.multimodule.sample, PID: 6285
    java.lang.RuntimeException: Unable to start activity ComponentInfo{com.github.takahirom.dagger.hilt.multimodule.sample/com.github.takahirom.feature.MainActivity}: java.lang.ClassCastException: com.github.takahirom.dagger.hilt.multimodule.sample.DaggerApp_HiltComponents_ApplicationC$ActivityRetainedCImpl$ActivityCImpl cannot be cast to com.github.takahirom.feature.MainActivity_GeneratedInjector
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2646)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2707)
        at android.app.ActivityThread.-wrap12(ActivityThread.java)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1460)
        at android.os.Handler.dispatchMessage(Handler.java:102)
        at android.os.Looper.loop(Looper.java:154)
        at android.app.ActivityThread.main(ActivityThread.java:6077)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:865)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:755)
     Caused by: java.lang.ClassCastException: com.github.takahirom.dagger.hilt.multimodule.sample.DaggerApp_HiltComponents_ApplicationC$ActivityRetainedCImpl$ActivityCImpl cannot be cast to com.github.takahirom.feature.MainActivity_GeneratedInjector
        at com.github.takahirom.feature.Hilt_MainActivity.inject(Hilt_MainActivity.java:62)
        at com.github.takahirom.feature.Hilt_MainActivity.onCreate(Hilt_MainActivity.java:37)
        at com.github.takahirom.feature.MainActivity.onCreate(MainActivity.kt:11)
        at android.app.Activity.performCreate(Activity.java:6662)
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1118)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2599)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2707) 
        at android.app.ActivityThread.-wrap12(ActivityThread.java) 
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1460) 
        at android.os.Handler.dispatchMessage(Handler.java:102) 
        at android.os.Looper.loop(Looper.java:154) 
        at android.app.ActivityThread.main(ActivityThread.java:6077) 
        at java.lang.reflect.Method.invoke(Native Method) 
        at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:865) 
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:755) 
```