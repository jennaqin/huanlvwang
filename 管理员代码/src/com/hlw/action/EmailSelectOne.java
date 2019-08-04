package com.hlw.action;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hlw.entries.Email;
import com.hlw.service.IEmailServer;
import com.hlw.serviceimpl.IEmailServiceImpl4;
//���������ʼ�
@WebServlet("/selectmail1")
public class EmailSelectOne extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IEmailServer iemailService = new IEmailServiceImpl4();
		//System.out.println(iemailService);
		List<Email> all = iemailService.emails("","","","","");//���list��ֻ��һ��email�������һ����Ϣ��
	//	List<List<String>> listTest = new ArrayList<List<String>>();
		request.setAttribute("email",all);
    }

}
