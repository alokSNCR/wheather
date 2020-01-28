package com.publicis.wheather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class WeatherResponse {
  @JsonProperty("date")
  private LocalDate date;

  @JsonProperty("temp")
  private float temperature;

  @JsonProperty("weather")
  private String weather;

  @JsonProperty("usertip")
  private String user_tip;

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public float getTemperature() {
    return temperature;
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
  }

  public String getWeather() {
    return weather;
  }

  public void setWeather(String weather) {
    this.weather = weather;
  }

  public String getUser_tip() {
    return user_tip;
  }

  public void setUser_tip(String user_tip) {
    this.user_tip = user_tip;
  }
}
