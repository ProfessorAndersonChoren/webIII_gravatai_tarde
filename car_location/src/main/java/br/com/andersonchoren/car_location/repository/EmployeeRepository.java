package br.com.andersonchoren.car_location.repository;

import br.com.andersonchoren.car_location.model.EmployeeModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EmployeeRepository implements IRepository<EmployeeModel>{
    private List<EmployeeModel> tEmployee = new ArrayList<>();
    @Override
    public boolean insert(EmployeeModel object) {
        return tEmployee.add(object);
    }

    @Override
    public List<EmployeeModel> findAll() {
        return tEmployee;
    }

    @Override
    public Optional<EmployeeModel> findByID(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean update(EmployeeModel object) {
        return false;
    }

    @Override
    public void delete(int id) {
        tEmployee.remove(id);
    }

    public EmployeeModel findByCpf(String cpf){
        return null;
    }
}
