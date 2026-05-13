package com.Ecommerce.ms_productos.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PRODUCTOS")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String nombre ;

    private String descripcion ;

    private Double precio ;

    private Integer stock ;

    private Boolean disponible ;

    private LocalDate fechaIngreso;




}
