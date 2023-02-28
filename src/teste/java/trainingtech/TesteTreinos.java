//package trainingtech;
//
//import javax.persistence.EntityManager;
//
//import br.com.trainingtech.dao.TreinoDAO;
//import br.com.trainingtech.model.Treino;
//import br.com.trainingtech.util.JPAUtil;
//
//public class TesteTreinos {
//
//	public static void main(String[] args) {
//		EntityManager em = JPAUtil.getEntityManager();
//		Treino treino = new Treino("A - Inferiores", "A /n B /n C");
//		TreinoDAO treinoDao = new TreinoDAO(em);
//		treinoDao.adicionaTreino(treino);
//		
//		//não funciona a criação do mysql pelo java, preciso criar
//		
//
//	}
//
//}
