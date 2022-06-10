package com.task.drone.repository;

import com.task.drone.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends JpaRepository <Medication, String >{
}
