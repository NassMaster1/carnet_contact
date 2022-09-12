package com.lip6.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lip6.services.ServiceAdresse.ServiceAdresse;



	
	@WebServlet("/AddAdresse")

	public class AddAdresse extends HttpServlet{
		
		
		private static final long serialVersionUID = 1L;
	    
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public AddAdresse() {
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

			String street=request.getParameter("Street");
			String city=request.getParameter("City");
			String zip=request.getParameter("zip");
			String country=request.getParameter("Country");

			
			ServiceAdresse src=new  ServiceAdresse();
			src.addAdresse(street, city,zip,country);
		}


}
