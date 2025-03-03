package com.cdap.climate_api.service;

import com.cdap.climate_api.model.Coordinates;
import com.cdap.climate_api.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private GeocodingService geocodingService;

    @Autowired
    private WeatherApiService weatherApiService;

    public WeatherResponse getWeatherData(String location, String date) {
        Coordinates coordinates = geocodingService.getCoordinates(location);
        return weatherApiService.fetchWeatherData(coordinates, date);
    }
}
