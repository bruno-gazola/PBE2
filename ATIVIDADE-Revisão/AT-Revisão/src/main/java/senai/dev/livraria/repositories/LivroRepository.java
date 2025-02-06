package senai.dev.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import senai.dev.livraria.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
	Livro findByIsbn(String isbn);
	
}