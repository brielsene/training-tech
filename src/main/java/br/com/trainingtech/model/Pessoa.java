package br.com.trainingtech.model;

import java.math.BigDecimal;

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
	private double peso;
	private double altura;
	private BigDecimal imc;
	private String usuario;
	private String senha;
	
	
	public Pessoa(String nome, double peso, double altura, BigDecimal imc) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
	}
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, double peso, double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Pessoa(String nome, double peso, double altura, BigDecimal imc, String usuario, String senha) {
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
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

	public void calculaIMC() {
		double resultado = this.peso/(this.altura*2);
		
		this.imc = BigDecimal.valueOf(resultado);
	}
	
	
	public boolean Autenticacao(String login, String senha) {
		if(!(this.usuario.equals(login)&this.senha.equals(senha))) {
			return false;
		}else {
			return true;
		}
		
	}
	
	
	
	
	
	
	

}
