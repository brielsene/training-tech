package br.com.trainingtech.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.trainingtech.dao.PessoaDAO;
import br.com.trainingtech.model.Pessoa;
import br.com.trainingtech.util.JPAUtil;

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
		HttpSession sessao = request.getSession();
		sessao.setAttribute("usuarioLogado", verificaLogin);
		return "redirect:controller?acao=HomePage";
	}

}
