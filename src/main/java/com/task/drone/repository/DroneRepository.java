package com.task.drone.repository;

import com.task.drone.model.Drone;
import com.task.drone.model.DroneState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DroneRepository extends JpaRepository<Drone,String> {
        Optional<Drone> findByDroneState(DroneState state);
        List<Drone> findAll();
        Optional<Drone> findBySerialNumber(String serialNumber);

}
