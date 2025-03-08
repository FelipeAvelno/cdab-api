package com.cdap.climate_api.controller;

import com.cdap.climate_api.model.WeatherResponse;
import com.cdap.climate_api.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/clima")
    public WeatherResponse getWeather(
            @RequestParam String location,
            @RequestParam(required = false) String date) {

        if (date == null || date.trim().isEmpty()) {
            date = LocalDate.now().toString();

        } else {
            date = date.split("T")[0];
        }

        return weatherService.getWeatherData(location, date);
    }
}
