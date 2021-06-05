package com.example.apiclientescrm.repositories;

import com.example.apiclientescrm.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {


    List<Producto> findProductosByNombreContaining(String nombre);

    List<Producto> findProductosByCategoriaContaining(String categoria);


}
