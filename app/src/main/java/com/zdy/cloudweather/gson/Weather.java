package com.zdy.cloudweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mike_zdy on 2017/5/15.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList; 
}
