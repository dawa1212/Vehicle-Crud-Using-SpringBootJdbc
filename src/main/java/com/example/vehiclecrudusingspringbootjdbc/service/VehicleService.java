package com.example.vehiclecrudusingspringbootjdbc.service;

import com.example.vehiclecrudusingspringbootjdbc.model.Vehicle;

import java.util.List;

public interface VehicleService {
    public abstract void createVehicle(Vehicle vehicle);
    public abstract Vehicle getVehicleById(Integer vehicleId);
    public abstract List<Vehicle> getAllVehicles();
    public abstract void updateVehicleById(Vehicle vehicleName, long vehicleId);
    public abstract void deleteVehicleById(long vehicleId);
}
