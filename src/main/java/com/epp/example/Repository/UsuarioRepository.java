package com.epp.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epp.example.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
