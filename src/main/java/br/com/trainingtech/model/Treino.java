//package br.com.trainingtech.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Treino")
//public class Treino {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	@Column(name = "nome_treino")
//	private String nomeTreino;
//	private String descricao;
//	
//	public Treino() {
//		
//	}
//
//	public Treino(String nomeTreino, String descricao) {
//		this.nomeTreino = nomeTreino;
//		this.descricao = descricao;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getNomeTreino() {
//		return nomeTreino;
//	}
//
//	public void setNomeTreino(String nomeTreino) {
//		this.nomeTreino = nomeTreino;
//	}
//
//	public String getDescricao() {
//		return descricao;
//	}
//
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//
//	@Override
//	public String toString() {
//		return "Treino [id=" + id + ", nomeTreino=" + nomeTreino + ", descricao=" + descricao + "]";
//	}
//	
//	
//
//}
