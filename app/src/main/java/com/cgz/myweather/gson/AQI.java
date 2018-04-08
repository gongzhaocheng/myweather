package com.cgz.myweather.gson;

/**
 * @author Administrator
 *         des
 * @uperdateAuthor
 * @updateDes
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
