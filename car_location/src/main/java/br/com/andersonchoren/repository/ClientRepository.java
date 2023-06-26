package br.com.andersonchoren.repository;

import br.com.andersonchoren.model.ClientModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClientRepository implements IRepository<ClientModel> {

    // TODO Implementar os métodos update, findByID, findByName
    private final List<ClientModel> tClients = new ArrayList<>();

    @Override
    public boolean insert(ClientModel object) {
        return tClients.add(object);
    }

    @Override
    public List<ClientModel> findAll() {
        return tClients;
    }

    @Override
    public Optional<ClientModel> findByID(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean update(ClientModel object) {
        return false;
    }

    @Override
    public void delete(int id) {
        tClients.remove(id);
    }

    public ClientModel findByName(String name){
        return null;
    }
}
