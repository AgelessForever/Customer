package com.guigu.customer.web.ui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guigu.customer.utils.Globals;

@WebServlet("/AddCustomerUIServlet")
public class AddCustomerUIServlet extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setAttribute("preferences", Globals.preferences);
	    request.setAttribute("types", Globals.types);
	    request.getRequestDispatcher("/WEB-INF/jsp/addCustomer.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
