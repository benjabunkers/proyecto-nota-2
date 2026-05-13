package com.Ecommerce.ms_productos.dto;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductoDTO {

    private Integer id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100, message = "El nombre no puede superar los 100 caracteres")
    private String nombre;

    @NotBlank(message = "La descripcion es obligatoria")
    @Size(max = 500, message = "La descripcion no puede superar los 500 caracteres")
    private String descripcion;

    @DecimalMin("0.0") @Digits(integer=8, fraction=2)
    private Double precio;

    @Positive @Min(value=0)
    private Integer stock;

    private boolean disponible;

    @NotNull @PastOrPresent
    private LocalDate fechaIngreso;



}
