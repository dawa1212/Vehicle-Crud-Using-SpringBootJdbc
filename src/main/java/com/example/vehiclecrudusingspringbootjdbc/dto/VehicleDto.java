package com.example.vehiclecrudusingspringbootjdbc.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDto {
    @NotNull
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String model;
    @NotEmpty
    @NotNull
    private double price;
}
