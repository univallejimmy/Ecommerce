package com.andresproyecto.ecommerce_spring.service;

import com.andresproyecto.ecommerce_spring.model.Orden;

import java.util.List;

public interface IOrdenService {
    List<Orden> findAll();
    Orden save(Orden orden);
    String generarNumeroOrden();
}

