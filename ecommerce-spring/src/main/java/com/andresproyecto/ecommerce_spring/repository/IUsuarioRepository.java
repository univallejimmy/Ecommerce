package com.andresproyecto.ecommerce_spring.repository;

import com.andresproyecto.ecommerce_spring.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer >{
    Optional<Usuario> findByEmail(String email);
}
