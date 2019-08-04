package com.hlw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hlw.entries.Manage;
import com.hlw.service.IEmailServer;
import com.hlw.service.IManageService;
import com.hlw.serviceimpl.ManageServiceImpl;

/**
 * Servlet implementation class Manage
 */
@WebServlet("/ManageAction")
public class ManageAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IManageService iManageService = new ManageServiceImpl();
//		IEmailServer iEmailServer = new IEm
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Manage manage=new Manage(email,password);
		Manage m=iManageService.login(manage);
		HttpSession session=request.getSession(true);
		String erro ="用户名和密码错误";
		if(m!=null){
			session.setAttribute("Manage",m);
			
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}else{
			session.setAttribute("erro",erro);
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
