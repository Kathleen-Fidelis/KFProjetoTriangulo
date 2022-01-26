package com.proj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TrianguloServlet
 */
@WebServlet("/TrianguloServlet")
public class TrianguloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrianguloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int var1 = Integer.parseInt(request.getParameter("lado1")); 
		int var2 = Integer.parseInt(request.getParameter("lado2"));
		int var3 = Integer.parseInt(request.getParameter("lado3"));
		
		//Verificando se é um triangulo
		if(var1 + var2 > var3 || var2 + var3 > var1|| var1 + var3 > var2) {
			if(var1 == var2 && var1 == var3) {
				response.getWriter().println("Triângulo equilátero");
			} else if(var1 == var2 || var2 == var3 || var1 == var3) {
				response.getWriter().println("Triângulo isóceles");
			}else{
				response.getWriter().println("Triângulo escaleno");
			}
		}
	}

}
