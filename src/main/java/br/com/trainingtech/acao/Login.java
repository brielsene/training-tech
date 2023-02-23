package br.com.trainingtech.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.trainingtech.dao.PessoaDAO;
import br.com.trainingtech.util.JPAUtil;
import br.com.trainingtech.model.Pessoa;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		PessoaDAO pessoaDAO = new PessoaDAO(JPAUtil.getEntityManager());
		Pessoa pessoa = new Pessoa(request.getParameter("usuario"), request.getParameter("senha"));
		Pessoa verificaLogin = pessoaDAO.verificaLogin(pessoa);
		System.out.println(verificaLogin);
		System.out.println(request.getParameter("usuario"));
		if(verificaLogin == null) {
			return "redirect:controller?acao=FormLogin";
		}
		
		return "redirect:controller?acao=HomePage";
	}

}
