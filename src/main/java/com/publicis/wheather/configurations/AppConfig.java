package com.publicis.wheather.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Value("${weather.forecast.url}")
    private String weatherUrl;

    @Value("${weather.forecast.days}")
    private int weatherForecastDays;

    public String getWeatherUrl() {
        return weatherUrl;
    }

    public void setWeatherUrl(String weatherUrl) {
        this.weatherUrl = weatherUrl;
    }

    public int getWeatherForecastDays() {
        return weatherForecastDays;
    }

    public void setWeatherForecastDays(int weatherForecastDays) {
        this.weatherForecastDays = weatherForecastDays;
    }
}