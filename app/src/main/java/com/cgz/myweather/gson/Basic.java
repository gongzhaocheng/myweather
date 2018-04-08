package com.cgz.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Administrator
 *         des
 * @uperdateAuthor
 * @updateDes
 */

public class Basic {
    @SerializedName("city")
    public  String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
