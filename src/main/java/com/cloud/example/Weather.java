package com.cloud.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
