package com.example.flood.controller;

import com.example.flood.model.ControlAction;
import com.example.flood.service.ControlActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/controle")
public class ControlActionController {
    @Autowired
    private ControlActionService service;

    @PostMapping
    public ControlAction activate(@RequestParam String action) {
        return service.activateBarrier(action);
    }

    @GetMapping
    public List<ControlAction> list() {
        return service.getAllActions();
    }
}
