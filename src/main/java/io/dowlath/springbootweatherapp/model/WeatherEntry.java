package io.dowlath.springbootweatherapp.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @Author Dowlath
 * @create 7/18/2020 4:41 PM
 */
public class WeatherEntry implements Serializable {

    private Instant timeStamp;
    private double temperature;
    private Integer weatherId;
    private String weatherIcon;

    @JsonProperty("timestamp")
    public Instant getTimeStamp() {
        return this.timeStamp;
    }

    @JsonSetter("dt")
    public void setTimeStamp(long unixTime) {
        this.timeStamp = Instant.ofEpochMilli(unixTime * 1000);
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("main")
    public void setMain(Map<String,Object> main){
        setTemperature(Double.parseDouble(main.get("temp").toString()));
    }

    public Integer getWeatherId() {
        return this.weatherId;
    }

    public void setWeatherId(Integer weatherId) {
        this.weatherId = weatherId;
    }

    public String getWeatherIcon() {
        return this.weatherIcon;
    }

    @JsonProperty
    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }
}
