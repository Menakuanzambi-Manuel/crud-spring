package com.chinhosoft.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinhosoft.crud.models.Usuario;
import com.chinhosoft.crud.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioservice;
	
	@PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuarioservice.save(usuario);
	}

	@GetMapping(path = "/{id}")
	public Usuario getUsuario(@PathVariable int id){
		return usuarioservice.getUsuario(id);
	}

	@PutMapping()
	public Usuario updateUsuario(@RequestBody Usuario usuario){
		return usuarioservice.update(usuario);
	}

	@DeleteMapping(path = "/{id}")
	public String deleteUsuario(@PathVariable int id){
		return usuarioservice.delete(id);
	}

	public UsuarioService getUsuarioservice() {
		return usuarioservice;
	}

	public void setUsuarioservice(UsuarioService usuarioservice) {
		this.usuarioservice = usuarioservice;
	}
	   	
	
}
