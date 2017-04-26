package com.gavin.redagger.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gavin.redagger.inject.component.ApplicationComponent;

import javax.inject.Inject;


/**
 * 这里是萌萌哒注释君
 *
 * @author gavin.xiong 2016/12/30  2016/12/30
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    DataLayer mDataLayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        ApplicationComponent.Instance.get().inject(this);
        afterCreate(savedInstanceState);
    }

    protected abstract void afterCreate(@Nullable Bundle savedInstanceState);

    public DataLayer getDataLayer() {
        return mDataLayer;
    }

    public abstract void setContentView();
}
