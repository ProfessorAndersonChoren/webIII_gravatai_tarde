package br.com.andersonchoren.service;

import br.com.andersonchoren.model.LocationModel;
import br.com.andersonchoren.repository.LocationRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class LocationService implements IService<LocationModel>{
    private LocationRepository locationRepository;

    public LocationService(){
        locationRepository = new LocationRepository();
    }

    @Override
    public boolean insert(LocationModel object) {
        // TODO Inserir as validações
        return locationRepository.insert(object);
    }

    @Override
    public List<LocationModel> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public Optional<LocationModel> findById(UUID id) {
        // TODO Inserir as validações
        return locationRepository.findByID(id);
    }

    @Override
    public boolean update(LocationModel object) {
        // TODO Inserir as validações
        return locationRepository.update(object);
    }

    @Override
    public void delete(int position) {
        // TODO Inserir as validações
        locationRepository.delete(position);
    }
}
