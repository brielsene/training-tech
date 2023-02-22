package br.com.trainingtech.dao;

import javax.persistence.EntityManager;

import br.com.trainingtech.util.JPAUtil;
import br.com.trainingtech.util.Pessoa;

public class PessoaDAO {
	
	
	private EntityManager em;
	
	
	public PessoaDAO(EntityManager em) {
		this.em = em;
		
	}
	
	
	
	public void adicionarPessoa(Pessoa pessoa) {
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
	}

}
