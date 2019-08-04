package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IChangeMemberDao;
import com.hlw.entries.Member;
import com.rock.util.JDBCUtil;

public class IChangeMemberDaoImpl implements IChangeMemberDao{
	JDBCUtil util;
	public IChangeMemberDaoImpl(){
		util=new JDBCUtil();
	} 
	public int alterPasswd(Member member){
		String str = member.getMemberphone();
		String sql = "update member set password=? where memberphone='"+str+"'";
		return util.runSql(sql, member.getPassword());
	}
	public int alterMemberid(Member member){
		String str = member.getMemberphone();
		String sql = "update member set memberid=? where memberphone='"+str+"'";
		return util.runSql(sql, member.getMemberid());
	}
	public int alteranswer(Member member){
		String str = member.getMemberphone();
		String sql = "update member set answer=? where memberphone='"+str+"'";
		return util.runSql(sql, member.getAnswer());
	}
	public int alterquestionid(Member member){
		String str = member.getMemberphone();
		String sql = "update member set deptno=? where memberphone='"+str+"'";
		return util.runSql(sql, member.getDeptno());
	}
}
