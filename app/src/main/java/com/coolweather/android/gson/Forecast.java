package com.coolweather.android.gson;

import android.service.controls.templates.TemperatureControlTemplate;

import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Templates;

/**
 * Created by Jeas on 2021/2/2.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("tex_d")
        public String info;
    }
}