package com.Ecommerce.ms_usuarios.repository;

import com.Ecommerce.ms_usuarios.model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    List<Usuario> findByEmailAndActivo(String email, boolean activo);
}
