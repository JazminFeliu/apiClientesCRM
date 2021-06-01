package com.example.apiclientescrm.repositories;

import com.example.apiclientescrm.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findDistinctByEmpresa(String empresa);

    List<Cliente>findClienteByNombreContaining(String nombre);

    Cliente findClienteByIdclienteOrNombreEquals(Integer id, String nombre);

    List<Cliente>findClienteByEmpresaOrderByNombreAsc(String empresa);

}
