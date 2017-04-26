package com.gavin.redagger;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * API
 *
 * @author gavin.xiong 2016/12/9
 */
public interface ClientAPI {

    /**
     * 获取今日日报新闻列表
     *
     * @return TodayNews
     */
    @GET("news/latest")
    Observable<TodayNews> getTodayNews();

}
