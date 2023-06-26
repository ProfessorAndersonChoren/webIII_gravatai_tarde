package br.com.andersonchoren.repository;

import br.com.andersonchoren.model.VehicleModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class VehicleRepository implements IRepository<VehicleModel>{
    private List<VehicleModel> tVehicles = new ArrayList<>();
    @Override
    public boolean insert(VehicleModel object) {
        return tVehicles.add(object);
    }

    @Override
    public List<VehicleModel> findAll() {
        return tVehicles;
    }

    @Override
    public Optional<VehicleModel> findByID(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean update(VehicleModel object) {
        return false;
    }

    @Override
    public void delete(int id) {
        tVehicles.remove(id);
    }

    public VehicleModel findByPlate(String plate){
        return null;
    }
}
