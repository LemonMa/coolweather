package com.coolweather.android.gson;

import android.widget.Toast;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;
    @SerializedName("tmp_max")
    public String max_tmp;
    @SerializedName("tmp_min")
    public String min_tmp;

    @SerializedName("cond_txt_d")
    public String info;

}
