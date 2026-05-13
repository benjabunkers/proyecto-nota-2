package com.Ecommerce.ms_productos.repository;


import com.Ecommerce.ms_productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {

    List<Producto> findByNombre(
            String nombre,
            Double precio
    );
}
