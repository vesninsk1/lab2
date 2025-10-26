package com.example.laboratorka3.repositories;

import com.example.laboratorka3.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByAvailableTrue();
    List<Car> findByAvailableFalse();
}