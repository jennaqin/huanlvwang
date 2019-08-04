package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.EmailDao;
import com.hlw.daoimpl.IEmailDaoImpl3;
import com.hlw.entries.Email;
import com.hlw.service.IEmailServer;

public class IEmailServiceImpl3 implements IEmailServer{
	EmailDao emailDao; 
	public IEmailServiceImpl3(String name,String address,String content,String telephone,String email1){
		emailDao = new IEmailDaoImpl3();
	}
	@Override
	public List<Email> emails(String name,String address,String content,String telephone,String email1) {
		return emailDao.allEmail(name,address,content,telephone,email1);
	}
}
