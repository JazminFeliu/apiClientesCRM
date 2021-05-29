package com.example.apiclientescrm.services;

import com.example.apiclientescrm.entities.Cliente;
import com.example.apiclientescrm.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }

    public List<Cliente> buscarClientePorEmpresa(String empresa){
        return clienteRepository.findDistinctByEmpresa(empresa);
    }

    public List<Cliente> buscarClientePorNombre(String nombre){
        return clienteRepository.findClienteByNombreContaining(nombre);
    }

    public Cliente buscarPorID(Integer id){
        return clienteRepository.findById(id).orElse(null);
    }
}
