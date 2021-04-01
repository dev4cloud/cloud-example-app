package com.cloud.example.weather;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends CrudRepository<Weather, String> {
    Weather save(Weather weather);

    Weather findByCity(String city);

    void delete(Weather weather);
}
