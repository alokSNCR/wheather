package com.publicis.wheather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tempertaure {

    @JsonProperty("temp")
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}