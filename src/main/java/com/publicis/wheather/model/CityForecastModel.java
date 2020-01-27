package com.publicis.wheather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class CityForecastModel {

    @JsonProperty("list")
    private ArrayList<DailyForecast> list;

    public ArrayList<DailyForecast> getList() {
        return list;
    }

    public void setList(ArrayList<DailyForecast> list) {
        this.list = list;
    }
}