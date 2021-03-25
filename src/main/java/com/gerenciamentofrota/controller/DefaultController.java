package com.gerenciamentofrota.controller;

import com.gerenciamentofrota.service.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class DefaultController<M, S extends DefaultService<M, ?>> {

    @Autowired
    private S service;

    public S getService() {
        return service;
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<M>> findById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<M>> findAll(@RequestBody String search) throws Exception{
        System.out.println(search);
        if(search != null){
            return ResponseEntity.ok(service.findByString(search));
        }
        return ResponseEntity.ok(service.findAll());

    }

    @PostMapping
    public ResponseEntity<M> insert(@RequestBody M modelo) throws Exception{
        return ResponseEntity.ok(service.insert(modelo));
    }

    @PutMapping
    public ResponseEntity<M> update(@RequestBody M modelo) throws Exception{
        return ResponseEntity.ok(service.insert(modelo));
    }

    @DeleteMapping("{id")
    public void delete(@PathVariable Long id) throws Exception{
        service.delete(id);
    }
}
