package com.hlw.dao;

import java.util.List;

import com.hlw.entries.House;
import com.hlw.entries.Member;
import com.hlw.entries.Register;

public interface IHouseDao {
	public int save(House h);

	public House getHouseById(String phone);
}
