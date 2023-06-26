package br.com.andersonchoren.service;

import br.com.andersonchoren.model.ClientModel;
import br.com.andersonchoren.repository.ClientRepository;

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
        return false;
    }

    @Override
    public List<ClientModel> findAll() {
        return null;
    }

    @Override
    public Optional<ClientModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean update(ClientModel object) {
        return false;
    }

    @Override
    public void delete(int position) {

    }
}
