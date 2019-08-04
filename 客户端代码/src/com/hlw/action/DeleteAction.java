package com.hlw.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hlw.entries.ChangeApply;
import com.hlw.entries.Member;
import com.hlw.service.IChangeServer;
import com.hlw.service.IDeleteHouseServer;
import com.hlw.service.IMemberServer;
import com.hlw.serviceimpl.ChangeServerImpl;
import com.hlw.serviceimpl.DeleteHouseServerImpl;
import com.hlw.serviceimpl.MemberServerImpl1;

/**
 * Servlet implementation class DeleteAction
 */
@WebServlet("/DeleteAction")
public class DeleteAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	IChangeServer changeServer;
	IDeleteHouseServer iDeleteHouseServer;
	IMemberServer iMemberServer;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAction() {
        super();
        changeServer = new ChangeServerImpl();
        iDeleteHouseServer=new DeleteHouseServerImpl();
        iMemberServer = new MemberServerImpl1();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		if("getT".equals(method))
			this.getT(request,response);
		else if("getT1".endsWith(method))
			this.getT1(request,response);
		else if("getT2".equals(method))
			this.getT2(request,response);
		else if("getPage".equals(method))
			this.getPage(request,response);
		else if("delete".equals(method))
			this.delete(request,response);
		else if("delete1".equals(method))
			this.delete1(request,response);
		else if("batchDelete".equals(method))
			this.batchDelete(request,response);
		else if("batchDelete1".equals(method))
			this.batchDelete1(request,response);
		else if("getPage1".equals(method))
			this.getPage1(request,response);
		else if("getPage2".equals(method))
			this.getPage2(request,response);
		else if("getPage3".equals(method))
			this.getPage3(request,response);
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//房源表
	protected void getT1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("aewriauruwieryhweo");
		request.setAttribute("pageinfo",iDeleteHouseServer.queryByPage1("1"));
		request.getRequestDispatcher("/index4.jsp").forward(request,response);
	}
	//交换表
	protected void getPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpage=request.getParameter("cpage");
		request.setAttribute("pageinfo",changeServer.queryByPage1(cpage));
		request.getRequestDispatcher("/index3.jsp").forward(request,response);
	}
	
	//房源表
	protected void getPage1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpage=request.getParameter("cpage");
		request.setAttribute("pageinfo",iDeleteHouseServer.queryByPage1(cpage));
		request.getRequestDispatcher("/index4.jsp").forward(request,response);
	}
	//交换信息删除
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String caid=request.getParameter("caid");
		int a=changeServer.deleteById(caid);
		System.out.println(a);
		getPage(request,response);
	}
	protected void batchDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ids=request.getParameter("ids");
		int a=changeServer.batchDelete(ids);
		System.out.println(a);
		getPage(request,response);
	}
	protected void getPage3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpage=request.getParameter("cpage");
		String maxpage = request.getParameter("maxpage");
		if(Integer.parseInt(cpage)<=0){
			request.setAttribute("pageinfo",changeServer.queryByPage1("1"));
			request.getRequestDispatcher("/index3.jsp").forward(request,response);
		}
		else if(Integer.parseInt(cpage)>=Integer.parseInt(maxpage)){
			request.setAttribute("pageinfo",changeServer.queryByPage1(maxpage));
			request.getRequestDispatcher("/index3.jsp").forward(request,response);
		}
		else if(Integer.parseInt(cpage)>0&&Integer.parseInt(cpage)>Integer.parseInt(maxpage)){
			request.setAttribute("pageinfo",changeServer.queryByPage1(cpage));
			request.getRequestDispatcher("/index3.jsp").forward(request,response);
		}
	}
	//房源删除
	protected void delete1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone=request.getParameter("phone");
		int a=iDeleteHouseServer.deleteById(phone);
		HttpSession session=request.getSession(true);
		session.setAttribute("phone",phone);
		System.out.println(a);
		getPage1(request,response);
	}
	protected void batchDelete1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ids=request.getParameter("ids");
		int a=iDeleteHouseServer.batchDelete(ids);
		System.out.println(a);
		getPage1(request,response);
	}
	protected void getPage2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpage=request.getParameter("cpage");
		String maxpage = request.getParameter("maxpage");
		if(Integer.parseInt(cpage)<=0){
			request.setAttribute("pageinfo",iDeleteHouseServer.queryByPage1("1"));
			request.getRequestDispatcher("/index4.jsp").forward(request,response);
		}
		else if(Integer.parseInt(cpage)>=Integer.parseInt(maxpage)){
			request.setAttribute("pageinfo",iDeleteHouseServer.queryByPage1(maxpage));
			request.getRequestDispatcher("/index4.jsp").forward(request,response);
		}
		else if(Integer.parseInt(cpage)>0&&Integer.parseInt(cpage)>Integer.parseInt(maxpage)){
			request.setAttribute("pageinfo",iDeleteHouseServer.queryByPage1(cpage));
			request.getRequestDispatcher("/index4.jsp").forward(request,response);
		}
	}
	//交换表
	protected void getT(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("aewriauruwieryhweo");
		request.setAttribute("pageinfo",changeServer.queryByPage1("1"));
		request.getRequestDispatcher("/index3.jsp").forward(request,response);
	}
	//会员信息
	protected void getT2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("aewriauruwieryhweo");
		String memberphone = request.getParameter("memberphone");System.out.println(memberphone);
		Member member = new Member();
		member.setMemberphone(memberphone);
		request.setAttribute("pageinfo",iMemberServer.queryByPage1("1"));
		request.getRequestDispatcher("/index5.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
