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

@WebServlet("/ApplyAction")
public class ApplyAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	IApplyService applyservice;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyAction() {
        super();
        applyservice = new IApplyServiceImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String caid = request.getParameter("caid");
		String reHouseLocation=request.getParameter("reHouseLocation");
		String reAddress = request.getParameter("reAddress");
		String restartTime = request.getParameter("restartTime");
		String reacomplishTime = request.getParameter("reacomplishTime");
		ChangeApply changeapply = new ChangeApply();
		changeapply.setCacity(reHouseLocation);
		changeapply.setCaddress(reAddress);
		changeapply.setCastarttime(restartTime);
		changeapply.setCacomplishtime(reacomplishTime);
		changeapply.setCaid(caid);
		
		int a=applyservice.alterApply(changeapply);
		a = applyservice.alterAddress(changeapply);
		a = applyservice.alterstartTime(changeapply);
		a = applyservice.alteracomplishTime(changeapply);
		request.getRequestDispatcher("DeleteAction?method=getT").forward(request, response);
	}
	
}

