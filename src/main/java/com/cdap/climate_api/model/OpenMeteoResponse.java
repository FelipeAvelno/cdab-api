package com.cdap.climate_api.model;

import java.util.List;

public class OpenMeteoResponse {
    private Hourly hourly;

    public Hourly getHourly() {
        return hourly;
    }
    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    public static class Hourly {
        private List<String> time;
        private List<Double> temperature_2m;
        private List<Double> relativehumidity_2m;
        private List<Double> apparent_temperature;
        private List<Double> windspeed_10m;

        public List<String> getTime() {
            return time;
        }
        public void setTime(List<String> time) {
            this.time = time;
        }
        public List<Double> getTemperature_2m() {
            return temperature_2m;
        }
        public void setTemperature_2m(List<Double> temperature_2m) {
            this.temperature_2m = temperature_2m;
        }
        public List<Double> getRelativehumidity_2m() {
            return relativehumidity_2m;
        }
        public void setRelativehumidity_2m(List<Double> relativehumidity_2m) {
            this.relativehumidity_2m = relativehumidity_2m;
        }
        public List<Double> getApparent_temperature() {
            return apparent_temperature;
        }
        public void setApparent_temperature(List<Double> apparent_temperature) {
            this.apparent_temperature = apparent_temperature;
        }
        public List<Double> getWindspeed_10m() {
            return windspeed_10m;
        }
        public void setWindspeed_10m(List<Double> windspeed_10m) {
            this.windspeed_10m = windspeed_10m;
        }
    }
}
