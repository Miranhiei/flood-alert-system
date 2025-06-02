package com.example.flood.repository;

import com.example.flood.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Long> {}
