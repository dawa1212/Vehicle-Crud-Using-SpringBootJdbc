package com.example.vehiclecrudusingspringbootjdbc;

import com.example.vehiclecrudusingspringbootjdbc.dao.VehicleDao;
import com.example.vehiclecrudusingspringbootjdbc.dao.VehicleDaoImpl;
import com.example.vehiclecrudusingspringbootjdbc.model.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VehicleCrudUsingSpringBootJdbcApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext applicationContext = SpringApplication.run(VehicleCrudUsingSpringBootJdbcApplication.class, args);

//       VehicleDao vehicleDao =  applicationContext.getBean(VehicleDaoImpl.class);
//       vehicleDao.createVehicle(getVehicle());
//
//        Vehicle vehicle = vehicleDao.fetchVehicleById(1);
//        System.out.println(vehicle);
//        System.out.println("-----------------------------------------------------");
//        vehicleDao.fetchAllVehicles().forEach(System.out::println);
//        System.out.println("-----------------------------------------------------");
//        vehicleDao.updateVehicleById("Zixeer",1);
//        System.out.println("-----------------------------------------------------");
//        vehicleDao.deleteVehicleById(2);
//    }
//
//    private static Vehicle getVehicle(){
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Urus");
//        vehicle.setModel("Suzuki");
//        vehicle.setPrice(980000088);
//        return vehicle;
   }

}
