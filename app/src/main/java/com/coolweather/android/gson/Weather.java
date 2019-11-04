package com.coolweather.android.gson;

import android.widget.ListView;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public Update update;
    //public AQI aqi;
    public Now now;
    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;



}
