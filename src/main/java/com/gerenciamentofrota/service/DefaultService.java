package com.gerenciamentofrota.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class DefaultService<M, R extends JpaRepository<M, Long>> {

    @Autowired
    private R repository;

    public M insert(M model) throws Exception {
        return repository.save(model);
    }

    public Optional<M> findById(Long id) throws Exception {
        return repository.findById(id);
    }

    public List<M> findAll() throws Exception{
        return repository.findAll();
    }

    public void delete(Long id) throws Exception {
        repository.deleteById(id);
    }

    public R getRepository() {
        return repository;
    }
}
