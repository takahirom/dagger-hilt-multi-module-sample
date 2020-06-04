Not working yet

```
2020-06-04 10:36:55.375 6794-6794/? E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.github.takahirom.dagger.hilt.multimodule.sample, PID: 6794
    java.lang.RuntimeException: Unable to start activity ComponentInfo{com.github.takahirom.dagger.hilt.multimodule.sample/com.github.takahirom.feature.MainActivity}: kotlin.UninitializedPropertyAccessException: lateinit property hash has not been initialized
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
     Caused by: kotlin.UninitializedPropertyAccessException: lateinit property hash has not been initialized
        at com.github.takahirom.feature.MainActivity.onCreate(MainActivity.kt:17)
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