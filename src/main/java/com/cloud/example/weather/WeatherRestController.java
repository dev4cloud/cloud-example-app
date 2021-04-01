package com.cloud.example.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public Weather weather(@RequestParam(value = "city") String city) {
        return weatherService.findByCity(city);
    }
}
