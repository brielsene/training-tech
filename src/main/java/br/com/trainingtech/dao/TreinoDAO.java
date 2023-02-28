//package br.com.trainingtech.dao;
//
//import javax.persistence.EntityManager;
//
//import br.com.trainingtech.model.Treino;
//
//public class TreinoDAO {
//	
//	private EntityManager em;
//	
//	public TreinoDAO(EntityManager em) {
//		this.em = em;
//		
//		//terminar para testar o relacionamento 1 pra 1
//	}
//	
//	public void adicionaTreino(Treino treino) {
//		em.getTransaction().begin();
//		em.persist(treino);
//		
//	}
//
//}
