package com.cloud.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {
    @GetMapping("/weather")
    public Weather weather(@RequestParam(value = "city") String city) {
        return new Weather(city, 21);
    }
}
