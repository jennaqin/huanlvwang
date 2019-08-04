package com.hlw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hlw.service.IDeleteMemberServer;
import com.hlw.serviceimpl.DeleteMemberServerImpl;

/**
 * Servlet implementation class DeleteMemberAction
 */
@WebServlet("/DeleteMemberAction")
public class DeleteMemberAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IDeleteMemberServer iDeleteMemberServer;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMemberAction() {
        super();
        iDeleteMemberServer = new DeleteMemberServerImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		if("delete".equals(method))
			this.delete(request,response);
		else if("getPage".equals(method))
			this.getPage(request,response);
		else if("getT".equals(method))
			this.getT(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void getPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cpage=request.getParameter("cpage");
			request.setAttribute("pageinfo",iDeleteMemberServer.queryByPage1(cpage));
			request.getRequestDispatcher("/portlet.jsp").forward(request,response);	
	}
	
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String memberphone=request.getParameter("memberphone");
		int a=iDeleteMemberServer.deleteById(memberphone);
		getPage(request,response);
	}
	protected void getT(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("pageinfo",iDeleteMemberServer.queryByPage1("1"));
		request.getRequestDispatcher("/portlet.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
