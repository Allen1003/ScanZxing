package com.example.scan.scanzxing;

import android.app.Application;

import org.xutils.x;

/**
 * Allen
 * 2019/6/21 0021 15:27
 **/
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
