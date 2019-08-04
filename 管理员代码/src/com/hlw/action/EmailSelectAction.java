package com.hlw.action;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import com.hlw.entries.Email;
import com.hlw.service.IEmailServer;
import com.hlw.serviceimpl.IEmailServiceImpl;
import com.hlw.serviceimpl.IEmailServiceImpl1;


//查询数据库中的所有信息，全部邮件
@WebServlet("/selectmail")


public class EmailSelectAction extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IEmailServer iemailService = new IEmailServiceImpl();
		//System.out.println(iemailService);
		List<Email> all = iemailService.emails("","","","","");
		request.setAttribute("all", all);
		//结果都存在了这个list里面，怎么传给jsp你自己设置吧，可以把下面的request改一改
		//request.setAttribute("emaillist", all);

    }

}
