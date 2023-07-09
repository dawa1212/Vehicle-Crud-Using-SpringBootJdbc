package com.example.vehiclecrudusingspringbootjdbc.controller;

import com.example.vehiclecrudusingspringbootjdbc.dao.VehicleDaoImpl;
import com.example.vehiclecrudusingspringbootjdbc.dto.VehicleDto;
import com.example.vehiclecrudusingspringbootjdbc.map.VehicleMapper;
import com.example.vehiclecrudusingspringbootjdbc.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
    @Autowired
    private VehicleDaoImpl vehicleDaoImpl;

    @GetMapping
    public List<Vehicle> fetchAllVehicle() {
        return vehicleDaoImpl.fetchAllVehicles();
    }

    @PostMapping
    public void createVehicle(@RequestBody VehicleDto vehicleDto) {
        Vehicle vehicle = VehicleMapper.mapToVehicle(vehicleDto);
        vehicleDaoImpl.createVehicle(vehicle);
    }

    @GetMapping("{id}")
    public Vehicle fetchVehicleByid(@PathVariable long id) {
        return vehicleDaoImpl.fetchVehicleById(id);
    }

    @PutMapping
    public ResponseEntity<String> updateVehicleById(@RequestBody VehicleDto vehicleDto) {
        Vehicle vehicle = VehicleMapper.mapToVehicle((vehicleDto));
        vehicleDaoImpl.updateVehicleById(vehicle);
        return new ResponseEntity<>("Vehicle updated successfully",HttpStatus.OK);

    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable long id) {
        vehicleDaoImpl.deleteVehicleById(id);

    }


}
