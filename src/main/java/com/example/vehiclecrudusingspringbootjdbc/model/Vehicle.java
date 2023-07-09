package com.example.vehiclecrudusingspringbootjdbc.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Vehicle {
    private Long id;
    private String name;
    private String model;
    private double price;

}
