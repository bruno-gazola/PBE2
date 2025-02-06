package senai.dev.livraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_editora")
public class Editora {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_editora;
	
	@Column(name = "nome editora", length = 100, nullable = false)
	private String nome_editora;
	
	@Column(name = "cnpj", length = 14, nullable = false, unique = true)
	private String cnpj;
	
	@Column(name = "contato", length = 100, nullable = false)
	private String contato;
	
	@Column(name = "email", length = 100, nullable = false)
	private String email;
	
	
	//Construtores
	public Editora() {
		
	}
	
	public Editora(Long id_editora, String cnpj, String email, String nome_editora, String contato) {
		this.id_editora = id_editora;
		this.nome_editora = nome_editora;
		this.cnpj = cnpj;
		this.contato = contato;
		this.email = email;
	}


	//Getters and Setters
	public Long getId_editora() {
		return id_editora;
	}

	public void setId_editora(Long id_editora) {
		this.id_editora = id_editora;
	}

	public String getNome_editora() {
		return nome_editora;
	}

	public void setNome_editora(String nome) {
		this.nome_editora = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String nome_contato) {
		this.contato = nome_contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}