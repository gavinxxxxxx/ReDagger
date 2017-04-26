package com.gavin.redagger.base;

import com.gavin.redagger.ClientAPI;
import com.gavin.redagger.inject.component.ApplicationComponent;
import com.google.gson.Gson;

import javax.inject.Inject;

/**
 * @author lsxiao
 * @date 2015-11-03 22:28
 */
public abstract class BaseManager {
    @Inject
    ClientAPI mApi;
    @Inject
    Gson mGson;

    public BaseManager() {
        ApplicationComponent.Instance.get().inject(this);
    }

    public ClientAPI getApi() {
        return mApi;
    }

    public Gson getGson() {
        return mGson;
    }
}
