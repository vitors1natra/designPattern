package com.design.patterns.service;

import com.design.patterns.model.Cliente;
import com.design.patterns.model.Endereco;

import java.util.List;

public interface ClienteService {

    Iterable<Cliente> findAll();

    Cliente findById(Long id);

    List<Endereco> findByEstado(String estado);

    void insert(Cliente cliente);

    void update(Long id, Cliente cliente);

    void deleteById(Long id);

}
