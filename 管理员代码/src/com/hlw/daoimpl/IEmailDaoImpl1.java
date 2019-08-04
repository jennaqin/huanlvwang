package com.hlw.daoimpl;
import java.util.List;

import com.hlw.dao.EmailDao;
import com.hlw.entries.Email;
import com.rock.util.JDBCUtil;

public class IEmailDaoImpl1 implements EmailDao{
	JDBCUtil util;

	public IEmailDaoImpl1() {
		util = new JDBCUtil();
	}

	@Override
	public List<Email> allEmail(String name,String address,String content,String telephone,String email1) {
		//List<Email> a = new ArrayList();
		String sql = "insert into email (name,address,content,telephone,email1) values(" +"'"+name+"'"+","+"'"+address+"'"+ ","+"'"+content+"'" +","+ "'"+telephone+"'"+","+"'"+ email1+"'" +")";
		System.out.println(sql);
		util.runSql(sql);
		//util.runSql(sql);
		//return util.queryAll(Email.class, sql);
		return null;
	}
}
