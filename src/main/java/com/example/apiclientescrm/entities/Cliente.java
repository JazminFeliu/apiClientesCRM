package com.example.apiclientescrm.entities;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;
    private String nombre;
    private String empresa;
    private String cargo;
    private String telefono;
    private String email;

    public Cliente() {
    }

    public Cliente(Integer idcliente, String nombre, String empresa, String cargo, String telefono, String email) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.empresa = empresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.email = email;
    }

    public Cliente(String nombre, String empresa, String cargo, String telefono, String email) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.email = email;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer id_cliente) {
        this.idcliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + idcliente +
                ", nombre='" + nombre + '\'' +
                ", empresa='" + empresa + '\'' +
                ", cargo='" + cargo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
