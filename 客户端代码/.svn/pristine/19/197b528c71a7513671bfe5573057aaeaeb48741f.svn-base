package com.hlw.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hlw.entries.Member;
import com.hlw.service.IMemberService;
import com.hlw.serviceimpl.MemberServiceImpl;

@WebServlet("/MemberAction")
public class MemberAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public MemberAction() {
    	IMemberService iMemberService = new MemberServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IMemberService iMemberService = new MemberServiceImpl();
		String memberphone=request.getParameter("memberphone");
		String password=request.getParameter("password");
		Member member=new Member(memberphone,password);
		Member m=iMemberService.login(member);
		HttpSession session=request.getSession(true);
		if(m!=null){
			session.setAttribute("info", "succeed");
			session.setAttribute("Member",m);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}else{
			session.setAttribute("info", "ÇëÖØÐÂµÇÂ¼");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}}

}
