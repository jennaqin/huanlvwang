package com.hlw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hlw.service.FindPasswordServer;
import com.hlw.serviceimpl.FindPasswordServerImpl;
@WebServlet("/FindPasswordAction")
public class FindPasswordAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FindPasswordAction() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method=request.getParameter("method");
		System.out.println(method);
		if("findQuestion".equals(method))
			this.findQuestion(request,response);
		else if("findpwd".equals(method))
			this.findpwd(request,response);
		}
		
	
	FindPasswordServer findPasswordServer=new FindPasswordServerImpl();
	protected void findQuestion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberphone=request.getParameter("memberphone");
		
		String ques=findPasswordServer.findQuestion(memberphone);
		System.out.println("FindPasswordAction.findQuestion()"+ques);
		request.setAttribute("desc", ques);
		request.getSession(true).setAttribute("findpwdUserid", memberphone);
		request.getRequestDispatcher("/findpwd.jsp").forward(request, response);
		
	}
	protected void findpwd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String answer=request.getParameter("answer");
		
		String memberphone=request.getSession(true).getAttribute("findpwdUserid").toString();
		
		
			System.out.println("手机号："+memberphone);
			request.setAttribute("phone", memberphone);
			String password=findPasswordServer.findPwd(memberphone,answer);
			//如果密码能找到
			if(password != null){
				System.out.println("密码："+password);
				request.setAttribute("psd",password);
				request.getRequestDispatcher("/surePassword.jsp").forward(request, response);
			}else{
				String info="没有找到密码！！！";
				request.setAttribute("error",info);
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			}
		
		
		
//		request.setAttribute("error","�������롾"+password+"������¼��������޸�����Ӵ");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
