package br.com.andersonchoren.car_location.model;

import java.util.List;
import java.util.UUID;

public class VehicleModel {
    private UUID id;
    private String plate;
    private String model;
    private String brand;
    private String color;
    private short ageProduction;
    private short ageModel;
    private List<LocationModel> locations;
}
