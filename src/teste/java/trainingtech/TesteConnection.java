package trainingtech;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
		String senha = "111";
		
//		BigDecimal peso = new BigDecimal("86.00");
//		BigDecimal altura = new BigDecimal ("1.86");
//		BigDecimal imc = peso.divide(altura, 2, RoundingMode.HALF_UP);
//		
//		System.out.println(peso);
//		System.out.println(altura);
//		System.out.println(imc);
	
		Pessoa p = new Pessoa(login, senha);
		
		
		
		try {
			Pessoa verificaLogin = dao.verificaLogin(p);
			BigDecimal calculaIMC = verificaLogin.calculaIMC();
			System.out.println(calculaIMC);
		
			
			
		}catch (Exception e) {
			System.out.println("errinho de cria");
		}
		
		
		
		
		
		
		

	}

}
