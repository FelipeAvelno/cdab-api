package com.cdap.climate_api.model;

public class WeatherResponse {
    private double temperature;
    private double humidity;
    private double apparentTemperature;
    private double windspeed;

    public WeatherResponse() {}

    public WeatherResponse(double temperature, double humidity, double apparentTemperature, double windspeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.apparentTemperature = apparentTemperature;
        this.windspeed = windspeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(double windspeed) {
        this.windspeed = windspeed;
    }
}

