package com.andresproyecto.ecommerce_spring.repository;

import com.andresproyecto.ecommerce_spring.model.Orden;
import com.andresproyecto.ecommerce_spring.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
    List<Orden> findByUsuario (Usuario usuario);
}
