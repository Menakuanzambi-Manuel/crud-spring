package com.chinhosoft.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinhosoft.crud.models.Usuario;
import com.chinhosoft.crud.repository.UsaurioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsaurioRepository usuarioRepository;

	public Usuario save(Usuario us) {
		return usuarioRepository.save(us);
	}

	public Usuario getUsuario(int id){
		return usuarioRepository.findById(id).get();
	} 

	public Usuario update(Usuario usuario){
		Usuario us = usuarioRepository.findById(usuario.getId()).get();
		us.setNome(usuario.getNome());
		us.setEmail(usuario.getEmail());
		us.setSenha(usuario.getSenha());
		us.setDataNasc(usuario.getDataNasc());
		us.setSexo(usuario.getSexo());
		us.setAtivo(usuario.getAtivo());
		us.setToken(usuario.getToken());
		us.setDataCriacao(usuario.getDataCriacao());
		return usuarioRepository.save(us);
	}

	public String delete(int id){
		usuarioRepository.deleteById(id);
		return "dados apagado com sucesso" +id;
	}
	
	public UsaurioRepository getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(UsaurioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
}
