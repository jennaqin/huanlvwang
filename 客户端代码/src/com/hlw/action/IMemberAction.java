package com.hlw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hlw.entries.Member;
import com.hlw.service.IMemberService;
import com.hlw.serviceimpl.MemberServiceImpl;

/**
 * Servlet implementation class HouseChangeAction
 */
@WebServlet("/IMemberAction")
public class IMemberAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IMemberAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String memberphone=request.getParameter("memberphone");
		IMemberService service=new MemberServiceImpl();
		
		
		Member member=service.getMemberByid(memberphone);
		request.setAttribute("member", member);
		request.getRequestDispatcher("/memberChange.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
