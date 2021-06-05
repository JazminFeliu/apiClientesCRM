package com.example.apiclientescrm.controllers;

import com.example.apiclientescrm.entities.Producto;
import com.example.apiclientescrm.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;
import java.util.List;

@RestController
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping("productos")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }

    @GetMapping("productos/nombre/{nombre}")
        public List<Producto> findProductosByNombreContaining(@PathVariable String nombre){
        return productoService.findProductosByNombreContaining(nombre);
    }

    @GetMapping("productos/categoria/{categoria}")
    public List<Producto>findProductosByCategoriaContaining(@PathVariable String categoria){
        return productoService.findProductosByCategoriaContaining(categoria);
    }

    @PostMapping ("productos/guardar")
    public void guardarProducto(@RequestBody Producto producto){
        Producto productoNuevo = new Producto();
        productoService.guardarProducto(producto);
    }

    /*@PostMapping("producto/guardarDificil")
    public String guardarProductoGet(
            @RequestParam String codigo_producto,
            @RequestParam String categoria,
            @RequestParam String nombre,
            @RequestParam String descripcion,
            @RequestParam String precio_unitario,
            @RequestParam String stock){

    };*/

}
