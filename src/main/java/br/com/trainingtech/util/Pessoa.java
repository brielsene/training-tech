package br.com.trainingtech.util;

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
	private double imc;
	
	
	public Pessoa(String nome, double peso, double altura, double imc) {
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

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + "]";
	}
	
	public void calculaIMC() {
		this.imc = this.peso/(this.altura*2);
	}
	
	
	
	
	

}
