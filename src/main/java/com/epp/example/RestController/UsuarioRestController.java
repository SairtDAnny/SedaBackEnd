package com.epp.example.RestController;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epp.example.Entity.Rol;
import com.epp.example.Entity.Usuario;
import com.epp.example.Entity.UsuarioRol;
import com.epp.example.Service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/")
	public Usuario guardarUsuario (@RequestBody Usuario usuario) throws Exception{
		
		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		
		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setNombre("admin");
		
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setUsuario(usuario);
		usuarioRol.setRol(rol);
		
		usuarioRoles.add(usuarioRol);
		
		return usuarioService.guardarUsuario(usuario, usuarioRoles);
		
	}
	
	//OBTENER USUARIO
	
	@GetMapping("/{username}")
	public Usuario obtnerUsuario(@PathVariable("username") String username) {
		return usuarioService.obtenerUsuario(username);
	}
	
	//ELINMINAR USUARIO
	@DeleteMapping("/{usuarioId}")
	public void elimianrUsuario(@PathVariable("usuarioId") Long usurioId) {
		usuarioService.eliminarUsuario(usurioId);
	}
	
}
