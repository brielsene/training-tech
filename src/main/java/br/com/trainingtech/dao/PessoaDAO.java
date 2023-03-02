package br.com.trainingtech.dao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.trainingtech.util.JPAUtil;
import br.com.trainingtech.model.Pessoa;

public class PessoaDAO {

	private String jpql;
	private EntityManager em;

	public PessoaDAO(EntityManager em) {
		this.em = em;

	}

	public void adicionarPessoa(Pessoa pessoa) {
		pessoa.setAltura(BigDecimal.ZERO);
		pessoa.setPeso(BigDecimal.ZERO);
		em.getTransaction().begin();
		em.persist(pessoa);
		
	}

	public Pessoa verificaLogin(Pessoa pessoa) {
		jpql = "SELECT p from Pessoa p where p.usuario = :usuario and p.senha = :senha";
		em.getTransaction().begin();
		try {
			Pessoa p1 = (Pessoa) em.createQuery(jpql).setParameter("usuario", pessoa.getUsuario())
					.setParameter("senha", pessoa.getSenha()).getSingleResult();
			return p1;
		} catch (Exception e) {
			System.out.println("Login ou senha incorreto");
			return null;
		}

	}
	
	public void adicionaUsuario(Pessoa pessoa) {
		em.getTransaction().begin();
		em.persist(pessoa);
		
		
	}

	public Pessoa buscaPessoaPeloId(Integer id) {
		return em.find(Pessoa.class, id);
		
		
	}

	public void atualizaPessoa(Pessoa pessoa) {
		em.getTransaction().begin();
		em.merge(pessoa);
		
		
	}

}
