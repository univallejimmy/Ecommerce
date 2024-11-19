package com.andresproyecto.ecommerce_spring.repository;
import com.andresproyecto.ecommerce_spring.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
