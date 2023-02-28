package br.com.trainingtech.acao;

import javax.persistence.EntityManager;
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
		EntityManager em = JPAUtil.getEntityManager();
		PessoaDAO pessoaDAO = new PessoaDAO(JPAUtil.getEntityManager());
		Pessoa pessoa = new Pessoa(request.getParameter("usuario"), request.getParameter("senha"));
		Pessoa verificaLogin = pessoaDAO.verificaLogin(pessoa);
		System.out.println(verificaLogin);
		System.out.println(request.getParameter("usuario"));
		if(verificaLogin == null) {
			return "redirect:controller?acao=FormLogin";
		}
		Pessoa buscaPessoaPeloId = pessoaDAO.buscaPessoaPeloId(verificaLogin.getId());
		em.close();
		
		if(buscaPessoaPeloId.getImc() == null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", verificaLogin);
			return "redirect:controller?acao=HomePage";
		}else {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", verificaLogin);
			sessao.setAttribute("imc", buscaPessoaPeloId.getImc());
			return "redirect:controller?acao=HomePage2";
		}
		
	}

}
