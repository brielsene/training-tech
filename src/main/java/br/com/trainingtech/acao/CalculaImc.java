package br.com.trainingtech.acao;

import java.math.BigDecimal;

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
		System.out.println("É: " + buscaPessoaPeloId.getAltura());

		if (buscaPessoaPeloId.getAltura().equals(new BigDecimal("0.00"))
				&& buscaPessoaPeloId.getPeso().equals(new BigDecimal("0.00"))) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("id", buscaPessoaPeloId.getId());
			
			
			return "redirect:controller?acao=FormParaImc";

		}
		buscaPessoaPeloId.calculaIMC();
		em.getTransaction().commit();
		em.close();
		HttpSession sessao = request.getSession();
		sessao.setAttribute("imc", buscaPessoaPeloId.getImc());
		;
		return "redirect:controller?acao=HomePage2";
	}

}
