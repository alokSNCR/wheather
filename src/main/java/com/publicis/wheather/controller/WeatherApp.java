package com.publicis.wheather.controller;

import com.publicis.wheather.model.WeatherResponse;
import com.publicis.wheather.service.WeatherForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class WeatherApp {

  @Autowired
  private WeatherForecastService weatherForecastService;

  @GetMapping("/weather_report/cityname={location}")
  public ResponseEntity<?> getWeatherForCity(@PathVariable @NotNull String location) {

    List<WeatherResponse> response = weatherForecastService.getWeatherForCity(location);
    return new ResponseEntity<>(response, HttpStatus.OK);

  }

}
