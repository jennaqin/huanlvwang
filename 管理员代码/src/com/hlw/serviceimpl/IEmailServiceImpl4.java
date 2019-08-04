package com.hlw.serviceimpl;


import java.util.List;

import com.hlw.dao.EmailDao;
import com.hlw.daoimpl.IEmailDaoImpl4;
import com.hlw.entries.Email;
import com.hlw.service.IEmailServer;
public class IEmailServiceImpl4 implements IEmailServer{
	EmailDao emailDao; 
	public IEmailServiceImpl4(){
		emailDao = new IEmailDaoImpl4();
	}
	@Override
	public List<Email> emails(String name,String address,String content,String telephone,String email1) {
		return emailDao.allEmail(name,address,content,telephone,email1);
	}

}
