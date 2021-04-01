package com.cloud.example.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    public Weather findByCity(String city) {
        return weatherRepository.findByCity(city);
    }
}
