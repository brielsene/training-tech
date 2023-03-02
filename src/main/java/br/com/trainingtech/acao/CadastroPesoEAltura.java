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

public class CadastroPesoEAltura implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		EntityManager em = JPAUtil.getEntityManager();
		PessoaDAO pessoaDao = new PessoaDAO(em);
		BigDecimal altura = new BigDecimal(request.getParameter("altura"));
		BigDecimal peso = new BigDecimal(request.getParameter("peso"));
		HttpSession sessao = request.getSession();	
		Pessoa usuarioLogado = (Pessoa) sessao.getAttribute("usuarioLogado");
		

		Integer id = Integer.valueOf(usuarioLogado.getId());
		
		
		Pessoa buscaPessoaPeloId = pessoaDao.buscaPessoaPeloId(id);
		buscaPessoaPeloId.setAltura(altura);
		buscaPessoaPeloId.setPeso(peso);
		buscaPessoaPeloId.calculaIMC();
		
		pessoaDao.atualizaPessoa(buscaPessoaPeloId);
		sessao.setAttribute("usuarioLogado", buscaPessoaPeloId);
		em.getTransaction().commit();
		em.close();
		
		//ajeitar isso, pois lá no jsp home page 2, o imc lá não está com o msm nome da variável
		return"redirect:controller?acao=HomePage2";
	}

}
