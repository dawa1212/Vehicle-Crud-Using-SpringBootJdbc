package com.example.vehiclecrudusingspringbootjdbc.dao;

import com.example.vehiclecrudusingspringbootjdbc.model.Vehicle;

import java.util.List;

public interface VehicleDao {
    public  abstract void createVehicle(Vehicle vehicle);
    public abstract Vehicle fetchVehicleById(long vehicleId);
    public abstract List<Vehicle> fetchAllVehicles();
    public abstract void updateVehicleById(Vehicle vehicle);
    public abstract void deleteVehicleById(long vehicleId);
}
