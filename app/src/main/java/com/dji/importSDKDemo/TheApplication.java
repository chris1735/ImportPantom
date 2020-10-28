package com.dji.importSDKDemo;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import com.secneo.sdk.Helper;

public class TheApplication extends Application {

    public TheApplication() {
        super();
        System.out.println("------ " + getClass().getSimpleName() + ".Constructor  ------");
    }

    @Override
    public void onCreate() {
        System.out.println("*********  " + getClass().getSimpleName() + ".onCreate  *********");
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        System.out.println("*********  " + getClass().getSimpleName() + ".onTerminate  *********");
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        System.out.println("*********  " + getClass().getSimpleName() + ".onConfigurationChanged  *********");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        System.out.println("*********  " + getClass().getSimpleName() + ".onLowMemory  *********");
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        System.out.println("*********  " + getClass().getSimpleName() + ".onTrimMemory  *********");
        super.onTrimMemory(level);
    }

    @Override
    protected void attachBaseContext(Context paramContext) {
        System.out.println("*********  " + getClass().getSimpleName() + ".attachBaseContext  *********");
        super.attachBaseContext(paramContext);

        System.out.println("Helper.install start");
        Helper.install(TheApplication.this);
        System.out.println("Helper.install end");
    }




}