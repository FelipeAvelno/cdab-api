package com.cdap.climate_api.service;

import com.cdap.climate_api.model.Coordinates;
import com.cdap.climate_api.model.GeocodingResult;
import com.cdap.climate_api.model.GeocodingResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeocodingService {

    @Value("${geocoding.api.url}")
    private String geocodingApiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public Coordinates getCoordinates(String location) {
        String formattedLocation = location.replace(" ", "+");
        String url = String.format("%s?name=%s&language=pt&count=1", geocodingApiUrl, formattedLocation);


        GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
        if (response != null && response.getResults() != null && !response.getResults().isEmpty()) {
            GeocodingResult result = response.getResults().get(0);
            return new Coordinates(result.getLatitude(), result.getLongitude());
        }
        return null;
    }
}

