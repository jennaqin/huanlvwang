package com.hlw.service;

import java.util.List;

import com.hlw.entries.House;
import com.hlw.entries.PageInfo;

public interface IDeleteHouseServer {
	public List<House> queryByPage(String cpage);
	public PageInfo queryByPage1(String cpage);
	public int deleteById(String memberphone);
	public int batchDelete(String ids);
}
