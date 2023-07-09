//package com.example.vehiclecrudusingspringbootjdbc.service;
//
//import com.example.vehiclecrudusingspringbootjdbc.dao.VehicleDao;
//import com.example.vehiclecrudusingspringbootjdbc.model.Vehicle;
//
//import java.util.List;
//
//public class VehicleServiceImpl implements VehicleService{
//    private VehicleDao vehicleDao;
//    public VehicleDao getVehicleDao(){
//        return vehicleDao;
//    }
//
//    public void setVehicleDao(VehicleDao vehicleDao) {
//        this.vehicleDao = vehicleDao;
//    }
//
//    @Override
//    public void createVehicle(Vehicle vehicle) {
//        getVehicleDao().createVehicle(vehicle);
//
//    }
//
//    @Override
//    public Vehicle getVehicleById(Integer vehicleId) {
//        return getVehicleDao().fetchVehicleById(vehicleId);
//    }
//
//    @Override
//    public List<Vehicle> getAllVehicles() {
//        return getVehicleDao().fetchAllVehicles();
//    }
//
//    @Override
//    public void updateVehicleById(Vehicle vehicle, long vehicleId) {
//        getVehicleDao().updateVehicleById(vehicle,vehicleId);
//    }
//
//    @Override
//    public void deleteVehicleById(long vehicleId) {
//        getVehicleDao().deleteVehicleById(vehicleId);
//    }
//}
