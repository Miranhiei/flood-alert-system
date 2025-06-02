package com.example.flood.controller;

import com.example.flood.model.SensorData;
import com.example.flood.service.AlertService;
import com.example.flood.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensores")
public class SensorController {
    @Autowired
    private SensorService sensorService;
    @Autowired
    private AlertService alertService;

    @PostMapping
    public ResponseEntity<SensorData> receiveSensorData(@RequestBody SensorData data) {
        SensorData saved = sensorService.saveSensorData(data);
        alertService.checkAndGenerateAlert(saved);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public List<SensorData> list() {
        return sensorService.getAllSensorData();
    }
}
