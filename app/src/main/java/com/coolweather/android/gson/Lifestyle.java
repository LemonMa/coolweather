package com.coolweather.android.gson;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Lifestyle {

    @SerializedName("type")
    public String type;

    @SerializedName("txt")
    public String info;

    @NonNull
    @Override
    public String toString() {
        return type+" "+info;
    }
}
