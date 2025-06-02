package com.example.flood.service;

import com.example.flood.model.ControlAction;
import com.example.flood.repository.ControlActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControlActionService {
    @Autowired
    private ControlActionRepository repository;

    public ControlAction activateBarrier(String action) {
        ControlAction ctrl = new ControlAction(action);
        return repository.save(ctrl);
    }

    public List<ControlAction> getAllActions() {
        return repository.findAll();
    }
}
