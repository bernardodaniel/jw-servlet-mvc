package org.javaweb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/produtoController")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> produtos = new ArrayList<>();
		produtos.add("Pão Francês");
		produtos.add("Margarina");
		produtos.add("Café");
		
		request.setAttribute("produtos", produtos);
		request.getRequestDispatcher("resposta.jsp").forward(request, response);
		
	}

}
