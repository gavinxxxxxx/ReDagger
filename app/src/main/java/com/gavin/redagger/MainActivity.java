package com.gavin.redagger;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.gavin.redagger.base.BindingActivity;
import com.gavin.redagger.databinding.ActivityMainBinding;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends BindingActivity<ActivityMainBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void afterCreate(@Nullable Bundle savedInstanceState) {
        getDataLayer().getDailyService().getTodayNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TodayNews>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        L.e("onSubscribe - ");
                    }

                    @Override
                    public void onNext(TodayNews t) {
                        L.e("onNext - " + t);
                    }

                    @Override
                    public void onError(Throwable e) {
                        L.e("onError - " + e);
                    }

                    @Override
                    public void onComplete() {
                        L.e("onComplete - ");
                    }
                });
    }
}
