package com.hlw.daoimpl;

import com.hlw.dao.FindPasswordDao;
import com.hlw.entries.Member;
import com.hlw.entries.Question;
import com.hlw.entries.findMessage;
import com.rock.util.JDBCUtil;

public class FindPasswordDaoImpl implements FindPasswordDao{
	JDBCUtil util;
	public FindPasswordDaoImpl(){
		util=new JDBCUtil();
	}
	
	@Override
	public Member findQuestion(String memberphone) {
		String sql = "SELECT q.ques,m.* FROM question q INNER JOIN member m ON q.deptno=m.deptno WHERE m.memberphone=?";
		Member m = util.queryById(Member.class, sql,memberphone);
		return m;
		
	}
	@Override
	public String findPwd(String memberphone, String answer) {
		String sql="select password from member where memberphone=? and answer=?";
		Member u=util.queryById(Member.class, sql, memberphone,answer);
		if(u!=null)
			return u.getPassword();
		else return "";
	}


	
	
}
