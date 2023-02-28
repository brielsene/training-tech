package br.com.trainingtech.acao;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.trainingtech.dao.PessoaDAO;
import br.com.trainingtech.model.Pessoa;
import br.com.trainingtech.util.JPAUtil;

public class CalculaImc implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		EntityManager em = JPAUtil.getEntityManager();
		Integer id = Integer.valueOf(request.getParameter("id"));
		PessoaDAO pessoaDao = new PessoaDAO(em);
		Pessoa buscaPessoaPeloId = pessoaDao.buscaPessoaPeloId(id);
		buscaPessoaPeloId.calculaIMC();
		em.getTransaction().commit();
		em.close();
		HttpSession sessao = request.getSession();
		sessao.setAttribute("imc", buscaPessoaPeloId.getImc());
		;
		return "redirect:controller?acao=HomePage2";
	}

}
