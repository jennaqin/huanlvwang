package com.hlw.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hlw.entries.House;
import com.hlw.service.IChangeHouseService;
import com.hlw.serviceimpl.IChangeHouseServiceImpl;

@WebServlet("/ChangeHouseAction")
public class ChangeHouseAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	IChangeHouseService cmservice;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeHouseAction() {
        super();
        cmservice = new IChangeHouseServiceImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone = request.getParameter("phone");System.out.println("-----------------------");System.out.println(request.getParameter("phone"));
		
		String rehcity = request.getParameter("rehcity");
		String rehaddress = request.getParameter("rehaddress");
		String reharea = request.getParameter("reharea");
		String rehbedroom = request.getParameter("rehbedroom");
		String rehlivingroom = request.getParameter("rehlivingroom");
		String rehbalcony = request.getParameter("rehbalcony");
		String rehwashingroom = request.getParameter("rehwashingroom");
		String rehkitchen = request.getParameter("rehkitchen");
		String relivingnum = request.getParameter("relivingnum");
		String rebednum = request.getParameter("rebednum");
		String relivingstart = request.getParameter("relivingstart");
		String relivingfinish = request.getParameter("relivingfinish");
		House house = new House();
		house.setHouseaddr(rehaddress);
		house.setHousearea(reharea);
		house.setHousebalconyroom(rehbalcony);
		house.setHousebedroom(rehbedroom);
		house.setHousebedroomnum(rebednum);
		house.setHousebeginliving(relivingstart);
		house.setHousecity(rehcity);
		house.setHouseendliving(relivingfinish);
		house.setHousehallroom(rehlivingroom);
		house.setHousekitchen(rehkitchen);
		house.setHouselivingnum(relivingnum);
		house.setHouserestroom(rehwashingroom);
		
		house.setPhone(phone);System.out.println("-------------------");System.out.println(phone);
		
		int a=cmservice.alterhaddress(house);
		a = cmservice.alterharea(house);
		a = cmservice.alterhbalcony(house);
		a = cmservice.alterhbednum(house);
		a = cmservice.alterhbedroom(house);
		a = cmservice.alterhcity(house);
		a = cmservice.alterhkitchen(house);
		a = cmservice.alterhlivingfinish(house);
		a = cmservice.alterhlivingnum(house);
		a = cmservice.alterhlivingroom(house);
		a = cmservice.alterhlivingstart(house);
		a = cmservice.alterhwashingroom(house);
		request.getRequestDispatcher("DeleteAction?method=getT1").forward(request, response);
	}
}

