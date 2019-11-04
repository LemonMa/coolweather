package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {
    public String status;

    @SerializedName("basic")
    public Basic basic;

    public class Basic{
        @SerializedName("cid")
        public String AQIId;
    }

    @SerializedName("air_now_city")
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String qlty;
        public String pm25;
    }
}
