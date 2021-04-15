package com.cloud.example.weather;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weather")
public class Weather {
    @Id
    String city;
    int temperature;

    public Weather() {
    }

    public Weather(String city, int temperature) {
        this.city = city;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public int getTemperature() {
        return temperature;
    }
}
