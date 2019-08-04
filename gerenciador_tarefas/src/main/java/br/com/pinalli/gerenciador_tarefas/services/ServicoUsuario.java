package br.com.pinalli.gerenciador_tarefas.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.pinalli.gerenciador_tarefas.model.Usuario;
import br.com.pinalli.gerenciador_tarefas.repository.RepositorioUsuario;

@Service
public class ServicoUsuario {
	
	@Autowired
	private RepositorioUsuario repositorioUsuario;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public Usuario encontrarPorEmail(String email) {
		return  repositorioUsuario.findByEmail(email);
	}
	
	public void salvar(Usuario usuario) {
		
		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		repositorioUsuario.save(usuario);
		
	}

}