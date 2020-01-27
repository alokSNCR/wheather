package com.publicis.wheather.service;


import com.publicis.wheather.model.WeatherResponse;

import java.util.List;

public interface WeatherForecastService {
  List<WeatherResponse> getWeatherForCity(String location);
}
