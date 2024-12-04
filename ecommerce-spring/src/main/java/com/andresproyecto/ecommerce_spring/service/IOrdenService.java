package com.andresproyecto.ecommerce_spring.service;

import com.andresproyecto.ecommerce_spring.model.Orden;

import java.util.List;
import java.util.Optional;

public interface IOrdenService {
    List<Orden> findAll();
    Optional<Orden> findById(Integer id);
    Orden save (Orden orden);
    String generarNumeroOrden();

}

