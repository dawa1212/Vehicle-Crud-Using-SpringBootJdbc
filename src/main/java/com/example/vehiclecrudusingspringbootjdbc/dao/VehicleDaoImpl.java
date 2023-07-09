package com.example.vehiclecrudusingspringbootjdbc.dao;

import com.example.vehiclecrudusingspringbootjdbc.map.VehicleRowMapper;
import com.example.vehiclecrudusingspringbootjdbc.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class VehicleDaoImpl implements VehicleDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createVehicle(Vehicle vehicle) {
        String SQL = "INSERT INTO vehicles(name,model,price) VALUES (?,?,?)";
        int update = getJdbcTemplate().update(SQL,vehicle.getName(),vehicle.getModel(),vehicle.getPrice());
        if(update == 1){
            System.out.println("Vehicle is created...");
        }
    }

    @Override
    public Vehicle fetchVehicleById(long vehicleId) {
        String SQL = "SELECT * FROM vehicles WHERE id = ?;";
        return getJdbcTemplate().queryForObject(SQL,new VehicleRowMapper(),vehicleId);
    }

    @Override
    public List<Vehicle> fetchAllVehicles() {
        String SQL = "SELECT * FROM vehicles";
        return getJdbcTemplate().query(SQL, new VehicleRowMapper());
    }

    @Override
    public void updateVehicleById(Vehicle vehicle) {
    String SQL = "UPDATE vehicles set name  = ?, model  = ?, price  = ? WHERE id =?";
    int update = getJdbcTemplate().update(SQL, vehicle.getName(),vehicle.getModel(),vehicle.getPrice(),vehicle.getId());
    if(update == 1){
        System.out.println("Vehicle is updated");
    }
    }

    @Override
    public void deleteVehicleById(long vehicleId) {
        String SQL = "DELETE FROM vehicles WHERE id = ?";
        int update = getJdbcTemplate().update(SQL,vehicleId);
        if(update ==1){
            System.out.println("Vehicle id deleted with ID "+vehicleId);
        }
    }
}
