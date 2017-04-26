package com.gavin.redagger.base;

import android.app.Application;

import com.gavin.redagger.inject.component.ApplicationComponent;
import com.gavin.redagger.inject.component.DaggerApplicationComponent;
import com.gavin.redagger.inject.module.ApplicationModule;

/**
 * 自定义Application
 *
 * @author gavin.xiong 2016/5/18
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    private void initDagger() {
        ApplicationComponent.Instance.init(DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build());
    }
}
