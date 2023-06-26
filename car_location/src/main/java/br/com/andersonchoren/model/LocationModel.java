package br.com.andersonchoren.model;

import java.time.LocalDate;

public class LocationModel {
    private String UUID;
    private LocalDate leaseDate;
    private LocalDate returnDate;
    private ClientModel client;
    private EmployeeModel employee;
    private VehicleModel vehicle;
}
