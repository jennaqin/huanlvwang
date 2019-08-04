package com.hlw.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hlw.entries.Email;
import com.hlw.service.IEmailServer;
import com.hlw.service.IMemberService;
import com.hlw.serviceimpl.IEmailServiceImpl;
import com.hlw.serviceimpl.IEmailServiceImpl4;
import com.hlw.serviceimpl.MemberServiceImpl;

/**
 * Servlet implementation class MemberCountAction
 */
@WebServlet("/MemberCountAction")
public class MemberCountAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberCountAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(11111111);
		IEmailServer iemailService = new IEmailServiceImpl();
		//System.out.println(iemailService);
		HttpSession session=request.getSession(true);
		List<Email> all1 = iemailService.emails("","","","","");
		session.setAttribute("all", all1);
		IMemberService iMemberService = new MemberServiceImpl();
		int a = iMemberService.Count();
		int b = iMemberService.eCount();
		
		IEmailServer iEmailServer = new IEmailServiceImpl();
		System.out.println(11111111);
		System.out.println("Member1CountAction.doGet()"+a);
		session.setAttribute("count",a);
		session.setAttribute("ecount",b);
		String str="{\"count\":\""+a+"\",\"ecount\":\""+b+"\"}";
		System.out.println(str);
		response.getWriter().write(str);
		IEmailServer iemailService1 = new IEmailServiceImpl4();
		System.out.println(1111444444);
		List<Email> all = iemailService1.emails("","","","","");//这个list里只有一个email对象存了一条信息、
	//	List<List<String>> listTest = new ArrayList<List<String>>();
		System.out.println(5555555);
		Email e = all.get(0);
		System.out.println(e.getAddress());
		session.setAttribute("email",e);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
