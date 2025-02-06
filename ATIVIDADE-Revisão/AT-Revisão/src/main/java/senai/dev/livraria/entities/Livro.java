package senai.dev.livraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")
public class Livro {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_livro;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "isbn", length = 13, nullable = false, unique = true)
	private String isbn;
	
	@Column(name = "categoria", length = 100, nullable = false)
	private String categoria;
	
	@Column(name = "valor", nullable = false)
	private double valor;
	
	@Column(name = "autor", length = 50, nullable = false)
	private String autor;
	
	@JoinColumn(name = "Editora_id_editora")
	@ManyToOne
	private Editora editora;
	
	
	//Construtores 
	public Livro() {
		
	}
	
	public Livro(Long id_livro, String nome, String isbn, String categoria, int estoque, double valor) {
		this.id_livro = id_livro;
		this.nome = nome;
		this.isbn = isbn;
		this.categoria = categoria;
		this.valor = valor;
	}

	
	//Getters and Setters
	public Long getId_livro() {
		return id_livro;
	}

	public void setId_livro(Long id_livro) {
		this.id_livro = id_livro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}