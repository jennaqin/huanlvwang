package com.hlw.dao;

import java.util.List;

import com.hlw.entries.Member;
import com.hlw.entries.PageInfo;

public interface IDeleteMemberDao {
	public List<Member> queryByPage(int cp);
	public PageInfo queryByPage1(String cpage);
	public int deleteById(String memberphone);
}
