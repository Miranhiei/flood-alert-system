package com.example.flood.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ControlAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime timestamp;
    private String action;

    public ControlAction() {
        this.timestamp = LocalDateTime.now();
    }

    public ControlAction(String action) {
        this();
        this.action = action;
    }

    // Getters e Setters
    // ...
}
