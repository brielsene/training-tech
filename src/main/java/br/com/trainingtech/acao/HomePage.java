package br.com.trainingtech.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.trainingtech.model.Pessoa;

public class HomePage implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		HttpSession sessao = request.getSession();
		Pessoa usuarioLogado = (Pessoa) sessao.getAttribute("usuarioLogado");
		sessao.setAttribute("usuarioLogado", usuarioLogado);
		return "forward:homePage.jsp";
	}

}
