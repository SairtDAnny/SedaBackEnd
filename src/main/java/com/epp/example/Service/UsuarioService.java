package com.epp.example.Service;

import java.util.Set;

import com.epp.example.Entity.Usuario;
import com.epp.example.Entity.UsuarioRol;

public interface UsuarioService {

	public Usuario guardarUsuario (Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
	
	public Usuario obtenerUsuario (String username);
	
	public void eliminarUsuario(Long usuarioId);
	
}
