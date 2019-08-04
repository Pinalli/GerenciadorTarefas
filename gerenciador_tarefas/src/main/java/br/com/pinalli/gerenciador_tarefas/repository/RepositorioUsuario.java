package br.com.pinalli.gerenciador_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.pinalli.gerenciador_tarefas.model.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
	
		Usuario findByEmail(String email);

}
