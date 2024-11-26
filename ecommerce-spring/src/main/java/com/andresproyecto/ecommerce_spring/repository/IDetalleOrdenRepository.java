package com.andresproyecto.ecommerce_spring.repository;

import com.andresproyecto.ecommerce_spring.model.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {

}
