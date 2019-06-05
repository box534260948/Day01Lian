package com.bw.day01lianxi;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/*
 * 姓名:沈钊民
 * 时间:time
 * 描述:类名
 * */public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }


}
