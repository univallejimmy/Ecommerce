package com.andresproyecto.ecommerce_spring.service;

import com.andresproyecto.ecommerce_spring.model.Usuario;

import java.util.Optional;

public interface IUsuarioService {
    Optional <Usuario> findById(Integer id);
}
