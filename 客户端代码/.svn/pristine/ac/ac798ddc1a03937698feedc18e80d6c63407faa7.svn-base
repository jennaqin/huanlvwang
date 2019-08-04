package com.hlw.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hlw.entries.Question;
import com.hlw.service.IDeptService;
import com.hlw.serviceimpl.IDeptServiceImpl;

/**
 * Servlet implementation class actionEmployee
 */
@WebServlet("/actionEmployee")
public class actionEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public actionEmployee() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method=request.getParameter("method");
		if("getDept".equals(method))
			this.getDept(request,response);
		else if("getReturn".equals(method))
			this.getReturn(request,response);
	
	
	}

	protected void getDept(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IDeptService iDeptService=new IDeptServiceImpl();
	
		List<Question> all = iDeptService.getDepts();
		request.setAttribute("depts", all);
		
		System.out.println("getDept() is running...");
		request.getRequestDispatcher("/register.jsp").forward(request, response);
	
	}
	protected void getReturn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
