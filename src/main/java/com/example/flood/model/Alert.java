package com.example.flood.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime timestamp;
    private String level;
    private String message;

    public Alert() {}

    public Alert(LocalDateTime timestamp, String level, String message) {
        this.timestamp = timestamp;
        this.level = level;
        this.message = message;
    }

    // Getters e Setters
    // ...
}
