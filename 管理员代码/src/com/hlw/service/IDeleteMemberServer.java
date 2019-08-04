package com.hlw.service;

import java.util.List;

import com.hlw.entries.Member;
import com.hlw.entries.PageInfo;

public interface IDeleteMemberServer {
	public List<Member> queryByPage(String cpage);
	public PageInfo queryByPage1(String cpage);
	public int deleteById(String memberphone);
	//public int batchDelete(String ids);
}
