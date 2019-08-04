package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IRegisterDao;
import com.hlw.entries.Member;
import com.hlw.entries.Register;
import com.rock.util.JDBCUtil;

public class IRegisterDaoImpl implements IRegisterDao {
	JDBCUtil util = null;
	
	
	public IRegisterDaoImpl() {
		util = new JDBCUtil();
	}

	@Override
	public int save(Member m) {
		// TODO Auto-generated method stub
		String sql="insert into member(memberphone,password,memberid,deptno,answer) values(?,?,?,?,?)";
		return util.runSql(sql,m.getMemberphone(),m.getPassword(),m.getMemberid(),m.getDeptno(),m.getAnswer() );

	}

	

}
