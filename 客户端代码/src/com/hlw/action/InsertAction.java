package com.hlw.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import com.hlw.entries.House;
import com.hlw.entries.Member;
import com.hlw.entries.Question;
import com.hlw.entries.Register;
import com.hlw.service.IDeptService;
import com.hlw.service.IHouseService;
import com.hlw.service.IRegisterService;
import com.hlw.serviceimpl.IDeptServiceImpl;
import com.hlw.serviceimpl.IHouseServiceImpl;
import com.hlw.serviceimpl.IRegisterServiceImpl;

@WebServlet("/InsertAction")
public class InsertAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IRegisterService iRegisterService;
	IHouseService iHouseService;
    public InsertAction() {
    	iRegisterService = new IRegisterServiceImpl();
    	iHouseService = new IHouseServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String method = request.getParameter("method");
		
		if("save".equals(method))
			this.save(request, response);
		else if("inserthouse".equals(method))
			this.inserthouse(request,response);
		
		
	}
	protected void getDept(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IDeptService iDeptService=new IDeptServiceImpl();
	
		List<Question> all = iDeptService.getDepts();
		request.setAttribute("depts", all);
		
		System.out.println("getDept() is running...");
		request.getRequestDispatcher("/register.jsp").forward(request, response);
	
	}
	//注册
	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");  
        response.setContentType("text/html; charset=UTF-8");
		
		String memberphone = request.getParameter("registerUsername");
		String password = request.getParameter("registerPassword");
		String memberid = request.getParameter("registerUsername");
		String answer = request.getParameter("answer");
		String deptno = request.getParameter("deptno");
		Member m = new Member(memberphone,password,memberid,deptno,answer, deptno);
		int a = iRegisterService.save(m);
		System.out.println(a);
		System.out.println("doRegister() is running..");
		request.getRequestDispatcher("/registerSubmit.jsp").forward(request, response);
			
		
	}
	//增加房源
	protected void inserthouse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone = request.getParameter("phone");
		String housecity = request.getParameter("housecity");
		String houseaddr = request.getParameter("houseaddr");
		String housearea = request.getParameter("housearea");
		String housebedroom = request.getParameter("housebedroom");
		String househallroom = request.getParameter("househallroom");
		String housebalconyroom = request.getParameter("housebalconyroom");
		String houserestroom = request.getParameter("houserestroom");
		String housekitchen = request.getParameter("housekitchen");
		String houselivingnum = request.getParameter("houselivingnum");
		String housebedroomnum = request.getParameter("housebedroomnum");
		String housebeginliving = request.getParameter("housebeginliving");
		String houseendliving = request.getParameter("houseendliving");
		House h= new House(phone,housecity,houseaddr,housearea,housebedroom,househallroom,housebalconyroom,houserestroom,housekitchen,houselivingnum,housebedroomnum,housebeginliving,houseendliving);
		Object a = iHouseService.save(h);
		if(a != null){
			System.out.println("insertHouse() is running..");
			request.getRequestDispatcher("/insertHouse.jsp").forward(request, response);
		}else{
			String info="增加房源信息失败！！！";
			request.setAttribute("error",info);
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		if("getDept".equals(method))
			this.getDept(request,response);
	}

}
