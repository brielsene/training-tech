package br.com.trainingtech.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage2 implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		return "forward:homePage2.jsp";
	}

}
