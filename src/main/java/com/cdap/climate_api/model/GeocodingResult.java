package com.cdap.climate_api.model;

public class GeocodingResult {
    private double latitude;
    private double longitude;
    // Outros campos podem ser adicionados conforme a necessidade (ex.: name, country_code, etc.)

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
