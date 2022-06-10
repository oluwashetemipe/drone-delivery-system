package com.task.drone.service;

import com.task.drone.dtos.DroneRegistrationRequestdto;
import org.springframework.stereotype.Service;

@Service
public class DroneServiceImpl implements DroneService {
    public void registerDrone(DroneRegistrationRequestdto droneRegistrationRequestdto){
        return DroneRepository.save(droneRegistrationRequestdto);

    }
}
