package trainingtech;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.trainingtech.dao.PessoaDAO;
import br.com.trainingtech.util.JPAUtil;
import br.com.trainingtech.model.Pessoa;

public class TesteConnection {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		
		//Consertar o tipo de dado para imc ficar limitado as casas
		PessoaDAO dao = new PessoaDAO(em);
		String login = "gb";
		String senha = "1111";
		
		Pessoa p = new Pessoa(login, senha);
		try {
			Pessoa verificaLogin = dao.verificaLogin(p);
			System.out.println(verificaLogin);
		}catch (Exception e) {
			System.out.println("errinho de cria");
		}
		
		
		
		
		
		
		

	}

}
