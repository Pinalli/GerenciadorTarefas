package br.com.pinalli.gerenciador_tarefas.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.pinalli.gerenciador_tarefas.model.Tarefa;
//o spring gera essa classe em tempo de execuçao o banco de dados
public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{
	
	@Query("SELECT t FROM Tarefa t WHERE t.usuario.email = :emailUsuario")
	List<Tarefa> carregarTarefasPorUsuario(@Param("emailUsuario")String email);

}
