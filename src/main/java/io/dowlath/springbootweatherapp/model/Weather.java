package io.dowlath.springbootweatherapp.model;

/**
 * @Author Dowlath
 * @create 7/18/2020 4:40 PM
 */

public class Weather  extends WeatherEntry{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
