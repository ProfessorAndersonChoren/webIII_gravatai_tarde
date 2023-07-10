package br.com.andersonchoren.car_location.model;

import java.time.LocalDate;

public class LocationModel {
    private String UUID;
    private LocalDate leaseDate;
    private LocalDate returnDate;
    private ClientModel client;
    private EmployeeModel employee;
    private VehicleModel vehicle;
}
