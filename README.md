# CRUD EmpresaCRM ##
##Objetivos

#### Crear un sistema de gestión de clientes y productos para nuestro CRM Web. 
#### El sistema debe exponer 2 REST APIs (una para clientes y otra para productos). 
####  class Cliente { 
                    private Integer id_cliente; 
                    private String nombre; 
                    private String cargo; 
                    private String empresa; 
                    private String telefono; 
                    private String mail; 
                    } 

#### class Producto{ 
                    private Integer id_producto; 
                    private String codigo_producto; 
                    private String categoria; 
                    private String nombre; 
                    private String descripcion; 
                    private Double precio_unitario; 
                    private Integer stock; 
                    } 

### Las APIs deben permitir: 
crear, eliminar, modificar o buscar productos y clientes. 
Para buscar productos se puede filtrar por código, categoria, nombre o descripcion. 
Para buscar clientes se puede filtrar por nombre, cargo, empresa o por mail. 

Deseable: crear un endpoint /buscar que "detecte" automáticamente el tipo de búsqueda o permita evaluar distintos atributos. 

Ej.: api/clientes/buscar/ada 

## Base de Datos: EmpresaCRM
### Tablas: clientes, productos

# Entidades
## Cliente 
## Producto

# EndPoints
### GET /clientes
Lista todos los animales

### GET /productos
Lista todos los productos

###GET /clientes/nombre/{nombre}
Busca por nombres que contengan el valor

seguir...

Java backend 5 - ADA 2021

