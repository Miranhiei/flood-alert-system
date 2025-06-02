package com.example.flood.repository;

import com.example.flood.model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDataRepository extends JpaRepository<SensorData, Long> {}
