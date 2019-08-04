package com.hlw.dao;

import java.util.List;

import com.hlw.entries.House;
import com.hlw.entries.PageInfo;

public interface IDeleteHouseDao {
	public List<House> queryByPage(int cp);
	public PageInfo queryByPage1(String cpage);
	public int deleteById(String memberphone);
	public int batchDelete(String ids);
}
