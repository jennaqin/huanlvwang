package com.hlw.daoimpl;
import java.util.ArrayList;
import java.util.List;

import com.hlw.dao.EmailDao;
import com.hlw.entries.Email;
import com.rock.util.JDBCUtil;
public class IEmailDaoImpl3 implements EmailDao{
	JDBCUtil util;

	public IEmailDaoImpl3() {
		util = new JDBCUtil();
	}

	@Override
	public List<Email> allEmail(String name,String address,String content,String telephone,String email1) {
		//List<Email> a = new ArrayList();
		String sql = "delete from email1";
		//System.out.println(sql);
		util.runSql(sql);
		//util.runSql(sql);
		//return util.queryAll(Email.class, sql);
		return null;
	}
}
