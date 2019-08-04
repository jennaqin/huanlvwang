package com.hlw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hlw.entries.ChangeApply;
import com.hlw.service.IApplyService;
import com.hlw.serviceimpl.IApplyServiceImpl;


/**
 * Servlet implementation class HouseChangeAction
 */
@WebServlet("/ChangeApplyAction")
public class ChangeApplyAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeApplyAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String caid=request.getParameter("caid");
		IApplyService service=new IApplyServiceImpl();
		
		
		ChangeApply apply=service.getChangeApplyById(caid);
		request.setAttribute("apply", apply);
		request.getRequestDispatcher("/personChange.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
