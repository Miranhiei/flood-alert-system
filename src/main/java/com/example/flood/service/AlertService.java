package com.example.flood.service;

import com.example.flood.model.Alert;
import com.example.flood.model.SensorData;
import com.example.flood.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AlertService {
    @Autowired
    private AlertRepository alertRepository;

    public Alert checkAndGenerateAlert(SensorData data) {
        String level;
        if (data.getWaterLevel() > 80) {
            level = "ALTO";
        } else if (data.getWaterLevel() > 50) {
            level = "MÉDIO";
        } else {
            return null;
        }
        Alert alert = new Alert(LocalDateTime.now(), level, "Risco de enchente detectado");
        return alertRepository.save(alert);
    }

    public java.util.List<Alert> getAllAlerts() {
        return alertRepository.findAll();
    }
}
