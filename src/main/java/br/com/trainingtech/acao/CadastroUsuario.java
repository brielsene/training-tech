package br.com.trainingtech.acao;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.trainingtech.dao.PessoaDAO;
import br.com.trainingtech.model.Pessoa;
import br.com.trainingtech.util.JPAUtil;

public class CadastroUsuario implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		EntityManager em = JPAUtil.getEntityManager();
		PessoaDAO pessoaDao = new PessoaDAO(em);
		Pessoa pessoa = new Pessoa(request.getParameter("usuario"), request.getParameter("senha"));
		pessoaDao.adicionarPessoa(pessoa);
		em.getTransaction().commit();
		HttpSession sessao = request.getSession();
		sessao.setAttribute("usuarioLogado", pessoa);
		return "redirect:controller?acao=HomePage";
	}

}
