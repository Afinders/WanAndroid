package com.sofiworker.wanandroid;

import android.app.Application;

/**
 * 该类主要用于配置app启动的一些参数，如：主题等
 */

public class WanAndroidApp extends Application {

    private static WanAndroidApp app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public static WanAndroidApp getInstance(){
        return app;
    }
}
