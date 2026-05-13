package com.Ecommerce.ms_productos.mapper;

import com.Ecommerce.ms_productos.dto.ProductoDTO;
import com.Ecommerce.ms_productos.model.Producto;

public class ProductoMapper {

    public static ProductoDTO toDTO(Producto producto){
        return new ProductoDTO(
                producto.getId(),
                producto.getNombre(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getStock(),
                producto.getDisponible(),
                producto.getFechaIngreso()

        );
    }

    public static Producto toEntity(ProductoDTO dto) {
        return new Producto(
                dto.getId(),
                dto.getNombre(),
                dto.getDescripcion(),
                dto.getPrecio(),
                dto.getStock(),
                dto.isDisponible(),
                dto.getFechaIngreso()
        );
    }
}
