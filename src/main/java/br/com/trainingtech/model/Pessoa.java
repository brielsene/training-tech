package br.com.trainingtech.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private BigDecimal peso;
	private BigDecimal altura;
	private BigDecimal imc;
	private String usuario;
	private String senha;
	
	
	public Pessoa(String nome, BigDecimal peso, BigDecimal altura, BigDecimal imc) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
	}
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, BigDecimal peso, BigDecimal altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Pessoa(String nome, BigDecimal peso, BigDecimal altura, BigDecimal imc, String usuario, String senha) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public Pessoa(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getImc() {
		return imc;
	}

	public void setImc(BigDecimal imc) {
		this.imc = imc;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc
				+ ", usuario=" + usuario + ", senha=" + senha + "]";
	}

	public BigDecimal calculaIMC() {
		this.imc = this.peso.divide(this.altura.multiply(new BigDecimal("2")),2, RoundingMode.HALF_UP);
		return imc;

	}
	
	
	
		
	}
	
	
	
	
	
	
	


