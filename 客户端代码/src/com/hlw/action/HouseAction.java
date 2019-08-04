package com.hlw.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import com.hlw.entries.House;
import com.hlw.service.IHouseService;
import com.hlw.serviceimpl.IHouseServiceImpl;

@WebServlet("/HouseAction")
public class HouseAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public HouseAction() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//��ȡ���еķ�����ϸ
		IHouseService iHouseService = new IHouseServiceImpl();
//		List<House> all = iHouseService.allHouse();
		
//		request.setAttribute("House",all);
		System.out.println("HouseAction.doGet() is running.......");
		request.getRequestDispatcher("/submitHouse.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
