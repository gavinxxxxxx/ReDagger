package com.gavin.redagger.base;


import com.gavin.redagger.TodayNews;

import io.reactivex.Observable;

/**
 * @author lsxiao
 *         date 2015-11-03 22:28
 */
public class DailyManager extends BaseManager implements DataLayer.DailyService {

    @Override
    public Observable<TodayNews> getTodayNews() {
        return getApi().getTodayNews();
    }

}
