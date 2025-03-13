package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long id_endereco;
	
	@Column(name = "cep", nullable = false, length = 8)
	private String cep;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@Column(name = "cidade", nullable = false)
	private String cidade;
	
	@Column(name = "numero_casa", nullable = false)
	private String numeroCasa;
	
	@Column(name = "bairro", nullable = false)
	private String bairro;
	
	@Column(name = "rua", nullable = false)
	private String rua;
	
	@Column(name = "complemento", nullable = false)
	private String complemento;
	
	//Construtores
	public Endereco() {
		
	}
	
	public Endereco(Long id_endereco, String cep, String estado, String cidade, String numeroCasa, String bairro, String rua, String complemento) {
		this.id_endereco = id_endereco;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.numeroCasa = numeroCasa;
		this.bairro = bairro;
		this.rua = rua;
		this.complemento = complemento;
	}

	
	//Getters and Setters
	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getcomplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
