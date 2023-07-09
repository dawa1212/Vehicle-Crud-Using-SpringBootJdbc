package com.example.vehiclecrudusingspringbootjdbc.map;

import com.example.vehiclecrudusingspringbootjdbc.dto.VehicleDto;
import com.example.vehiclecrudusingspringbootjdbc.model.Vehicle;

public class VehicleMapper {
    public static Vehicle mapToVehicle(VehicleDto vehicleDto){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(vehicleDto.getId());
        vehicle.setName(vehicleDto.getName());
        vehicle.setPrice(vehicleDto.getPrice());
        vehicle.setModel(vehicleDto.getModel());
        return vehicle;
    }
}
