package com.task.drone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Drone {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    private String serialNumber;

    private int weight;

    private double batteryCapacity;

    public Drone() {
    }

    public Drone(String id, int weight, double batteryCapacity, String serialNumber) {
        this.id = id;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
