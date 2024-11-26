package com.andresproyecto.ecommerce_spring.repository;

import com.andresproyecto.ecommerce_spring.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {

}
