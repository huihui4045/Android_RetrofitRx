package com.huihui.retrofitrxandroiddagger;

import android.app.Application;

import com.huihui.retrofitrxandroiddagger.common.utils.CrashHandler;


/**
 * @Project retrofitrxandroiddagger2
 * @Packate com.micky.retrofitrxandroiddagger2
 * @Description
 * @Author Micky Liu
 * @Email mickyliu@126.com
 * @Date 2015-12-21 17:47
 * @Version 0.1
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
    }
}
