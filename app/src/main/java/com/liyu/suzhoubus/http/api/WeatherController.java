package com.liyu.suzhoubus.http.api;

import com.liyu.suzhoubus.http.BaseWeatherResponse;
import com.liyu.suzhoubus.model.HeWeather5;


import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 天气查询接口
 * Created by liyu on 2016/10/31.
 */

public interface WeatherController {

    @GET("https://free-api.heweather.com/v5/weather?key=b478f335a5114ba3b6013f6dd92bd422")
    Observable<BaseWeatherResponse<HeWeather5>> getWeather(@Query("city") String city);
}