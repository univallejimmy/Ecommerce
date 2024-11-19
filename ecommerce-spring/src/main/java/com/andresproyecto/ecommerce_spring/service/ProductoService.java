package com.andresproyecto.ecommerce_spring.service;


import com.andresproyecto.ecommerce_spring.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();

}
