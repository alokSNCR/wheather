package com.publicis.wheather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

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