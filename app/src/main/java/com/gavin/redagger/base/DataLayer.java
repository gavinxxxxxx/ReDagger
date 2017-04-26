package com.gavin.redagger.base;


import com.gavin.redagger.TodayNews;

import io.reactivex.Observable;

/**
 * @author lsxiao
 * @date 2015-11-03 22:28
 */
public class DataLayer {

    DailyService mDailyService;

    public DataLayer(DailyService dailyService) {
        mDailyService = dailyService;
    }

    public DailyService getDailyService() {
        return mDailyService;
    }

    public interface DailyService {

        /**
         * 获取最新日报新闻列表
         *
         * @return TodayNews
         */
        Observable<TodayNews> getTodayNews();
    }
}
