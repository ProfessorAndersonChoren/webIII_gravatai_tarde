package br.com.andersonchoren.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IRepository<E> {
    public boolean insert(E object);
    public List<E> findAll();
    public Optional<E> findByID(UUID id);
    public boolean update(E object);
    public void delete(int id);
}
