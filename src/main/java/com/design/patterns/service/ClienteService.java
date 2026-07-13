package com.design.patterns.service;

import com.design.patterns.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> findAll();

    Cliente findById(Long id);

    void insert(Cliente cliente);

    void update(Long id, Cliente cliente);

    void deleteById(Long id);

}
