package trainingtech;

import javax.persistence.EntityManager;

import br.com.trainingtech.dao.PessoaDAO;
import br.com.trainingtech.util.JPAUtil;
import br.com.trainingtech.util.Pessoa;

public class TesteConnection {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		PessoaDAO dao = new PessoaDAO(em);
		Pessoa p = new Pessoa("João", 1.80, 85);
		p.calculaIMC();
		dao.adicionarPessoa(p);
		

	}

}
