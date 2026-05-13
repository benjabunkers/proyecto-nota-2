package com.Ecommerce.ms_usuarios.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioDTO {

    private Integer id;
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Email @NotBlank
    private String email;

    private String telefono;

    @Min(value = 1, message = "La edad debe ser mayor a 0")
    @Max(value = 110, message = "La edad no puede superar 110")
    private Integer edad;

    private Boolean activo;

    @NotNull @PastOrPresent
    private LocalDate fechaRegistro;










}
