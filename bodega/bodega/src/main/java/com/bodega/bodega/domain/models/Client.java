package com.bodega.bodega.domain.models;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Client {

    // Atributos
    private LocalDateTime fechaTomaPedido;

    private String nombre;

    private String apellido;

    private  Integer nit;



}
