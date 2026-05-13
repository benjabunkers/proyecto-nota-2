package com.Ecommerce.ms_usuarios.mapper;

import com.Ecommerce.ms_usuarios.model.Usuario;
import com.Ecommerce.ms_usuarios.dto.UsuarioDTO;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario){
        return new UsuarioDTO(
                usuario.getId(),
                usuario.getNombre(),
                usuario.getEmail(),
                usuario.getTelefono(),
                usuario.getEdad(),
                usuario.getActivo(),
                usuario.getFechaRegistro()
        );
    }

    public static Usuario toEntity(UsuarioDTO dto){

        return new Usuario(
                dto.getId(),
                dto.getNombre(),
                dto.getEmail(),
                dto.getTelefono(),
                dto.getEdad(),
                dto.getActivo(),
                dto.getFechaRegistro()
        );
    }
}
