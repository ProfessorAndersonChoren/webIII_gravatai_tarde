package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.ClientModel;
import br.com.andersonchoren.car_location.repository.ClientRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClientService implements IService<ClientModel>{
    private ClientRepository clientRepository;

    public ClientService(){
        clientRepository = new ClientRepository();
    }

    @Override
    public boolean insert(ClientModel object) {
        // TODO Inserir as validações
        return clientRepository.insert(object);
    }

    @Override
    public List<ClientModel> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<ClientModel> findById(UUID id) {
        // TODO Inserir as validações
        return clientRepository.findByID(id);
    }

    @Override
    public boolean update(ClientModel object) {
        // TODO Inserir as validações
        return clientRepository.update(object);
    }

    @Override
    public void delete(int position) {
        // TODO Inserir as validações
        clientRepository.delete(position);
    }

    public ClientModel findByName(String name){
        return clientRepository.findByName(name);
    }
}
