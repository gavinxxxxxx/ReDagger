package com.gavin.redagger.inject.component;

import android.app.Application;
import android.support.annotation.NonNull;

import com.gavin.redagger.base.BaseActivity;
import com.gavin.redagger.base.BaseManager;
import com.gavin.redagger.inject.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author lsxiao
 * @date 2015-11-04 00:47
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseActivity activity);
//
//    void inject(BaseFragment fragment);

//    void inject(BaseDialogFragment dialogFragment);

    void inject(BaseManager manager);

    // 可以获取 ApplicationModule 及其 includes 的所有 Module 提供的对象（方法名随意）
    Application getApplication();

    class Instance {
        private static ApplicationComponent sComponent;

        public static void init(@NonNull ApplicationComponent component) {
            sComponent = component;
        }

        public static ApplicationComponent get() {
            return sComponent;
        }
    }
}
