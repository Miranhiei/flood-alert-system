package com.example.flood.controller;

import com.example.flood.model.Alert;
import com.example.flood.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alertas")
public class AlertController {
    @Autowired
    private AlertService alertService;

    @GetMapping
    public List<Alert> getAllAlerts() {
        return alertService.getAllAlerts();
    }
}
