package com.example.vehiclecrudusingspringbootjdbc.map;

import com.example.vehiclecrudusingspringbootjdbc.model.Vehicle;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class VehicleRowMapper implements RowMapper<Vehicle> {
    @Override
    public Vehicle mapRow(ResultSet rs, int rowNum) throws SQLException{
        Vehicle vehicle = new Vehicle();
        vehicle.setId(rs.getLong("id"));
        vehicle.setName(rs.getString("name"));
        vehicle.setModel(rs.getString("model"));
        vehicle.setPrice(rs.getDouble("price"));

        return vehicle;
    }
}
