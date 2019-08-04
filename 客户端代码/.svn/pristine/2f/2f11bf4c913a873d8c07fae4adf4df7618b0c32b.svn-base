package com.hlw.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hlw.entries.Member;
import com.hlw.service.IChangeMemberService;
import com.hlw.serviceimpl.IChangeMemberServiceImpl;


@WebServlet("/ChangeMemberAction")
public class ChangeMemberAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	IChangeMemberService cmservice;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeMemberAction() {
        super();
        cmservice = new IChangeMemberServiceImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void getPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String cpage=request.getParameter("cpage");
		//request.setAttribute("pageinfo",applyservice.queryByPage1(cpage));
		request.getRequestDispatcher("/index5.jsp").forward(request,response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberphone = request.getParameter("memberphone");
		String repasswd=request.getParameter("repasswd");
		String rememberid = request.getParameter("rememberid");
		String reanswer = request.getParameter("reanswer");
		String requestionid = request.getParameter("requestionid");
		Member cm = new Member();
		cm.setPassword(repasswd);
		cm.setMemberid(rememberid);
		cm.setAnswer(reanswer);
		cm.setDeptno(requestionid);
		cm.setMemberphone(memberphone);
		int a=cmservice.alterMemberid(cm);
		a = cmservice.alterPasswd(cm);
		a = cmservice.alteranswer(cm);
		a = cmservice.alterquestionid(cm);
		request.getRequestDispatcher("/index5.jsp").forward(request,response);
	}
	
}

