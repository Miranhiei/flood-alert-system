package com.example.flood.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime timestamp;
    private double waterLevel;
    private double temperature;
    private double humidity;
    private double rainIntensity;

    public SensorData() {
        this.timestamp = LocalDateTime.now();
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getRainIntensity() {
        return rainIntensity;
    }

    public void setRainIntensity(double rainIntensity) {
        this.rainIntensity = rainIntensity;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
