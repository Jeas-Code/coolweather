package com.coolweather.android.gson;

/**
 * Created by Jeas on 2021/2/2.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
