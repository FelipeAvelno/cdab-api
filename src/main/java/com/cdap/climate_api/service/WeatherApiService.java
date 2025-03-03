package com.cdap.climate_api.service;

import com.cdap.climate_api.model.Coordinates;
import com.cdap.climate_api.model.OpenMeteoResponse;
import com.cdap.climate_api.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {

    @Value("${openmeteo.api.url}")
    private String openMeteoApiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherResponse fetchWeatherData(Coordinates coordinates, String date) {
        String url = String.format("%s?latitude=%s&longitude=%s&date=%s&hourly=temperature_2m,relativehumidity_2m,apparent_temperature,windspeed_10m",
                openMeteoApiUrl, coordinates.getLatitude(), coordinates.getLongitude(), date);

        OpenMeteoResponse response = restTemplate.getForObject(url, OpenMeteoResponse.class);

        if (response != null && response.getHourly() != null && response.getHourly().getTime() != null) {
            int index = -1;
            for (int i = 0; i < response.getHourly().getTime().size(); i++) {
                String time = response.getHourly().getTime().get(i);
                if (time.contains("T12:00")) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                index = 0;
            }

            WeatherResponse weatherResponse = new WeatherResponse();
            weatherResponse.setTemperature(response.getHourly().getTemperature_2m().get(index));
            weatherResponse.setHumidity(response.getHourly().getRelativehumidity_2m().get(index));
            weatherResponse.setApparentTemperature(response.getHourly().getApparent_temperature().get(index));
            weatherResponse.setWindspeed(response.getHourly().getWindspeed_10m().get(index));

            return weatherResponse;
        }
        return new WeatherResponse();
    }
}
