package senai.dev.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import senai.dev.livraria.entities.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{
	Editora findByCnpj(String cnpj);
		
}

