package com.youqing.coolweather.gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Leon on 5/30 0030.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
