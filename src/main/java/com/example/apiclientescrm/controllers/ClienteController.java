package com.example.apiclientescrm.controllers;

import com.example.apiclientescrm.entities.Cliente;
import com.example.apiclientescrm.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("clientes")
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }

    @GetMapping("clientes/empresa/{empresa}")
    public List<Cliente> buscarClientePorEmpresa(@PathVariable String empresa){
        return clienteService.buscarClientePorEmpresa(empresa);
    }

    @GetMapping("clientes/nombre/{nombre}")
    public List<Cliente>buscarClientePorNombre(@PathVariable String nombre){
        return clienteService.buscarClientePorNombre(nombre);
    }

    @GetMapping("clientes/id/{id}")
    public Cliente buscarPorID(@PathVariable String id) {
        Integer unID =0;
        try {
            if (id != null)
                unID = Integer.valueOf(id);
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return clienteService.buscarPorID(unID);
    }

    @PostMapping("clientes/nuevo")
    public Cliente crear(@RequestBody Cliente cliente){
        clienteService.save(cliente);
        return cliente;
    }

    @DeleteMapping("clientes/borrar/{id}")
    public String borrar(@PathVariable Integer id) {
        clienteService.deletebyId(id);
        return "cliente borrado";
    }

}
