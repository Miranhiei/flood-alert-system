package com.example.flood.service;

import com.example.flood.model.SensorData;
import com.example.flood.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {
    @Autowired
    private SensorDataRepository repository;

    public SensorData saveSensorData(SensorData data) {
        return repository.save(data);
    }

    public List<SensorData> getAllSensorData() {
        return repository.findAll();
    }
}
