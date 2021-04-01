package com.cloud.example.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PopulateWeatherDbRunner implements CommandLineRunner {
    @Autowired
    WeatherRepository weatherRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        weatherRepository.save(new Weather("Stuttgart", 21));
        weatherRepository.save(new Weather("Hamburg", 12));
        weatherRepository.save(new Weather("Berlin", -1));
    }
}
