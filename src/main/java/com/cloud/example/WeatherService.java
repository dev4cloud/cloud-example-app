package com.cloud.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    public Weather findByCity(String city) {
        return weatherRepository.findByCity(city);
    }

    public void add(String city, int temperature) {
        weatherRepository.save(new Weather(city, temperature));
    }
}
