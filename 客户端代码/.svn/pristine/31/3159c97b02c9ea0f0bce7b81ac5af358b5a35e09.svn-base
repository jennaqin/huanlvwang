package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IHouseDao;
import com.hlw.entries.House;
import com.hlw.entries.Register;
import com.rock.util.JDBCUtil;

public class IHouseDaoImpl implements IHouseDao {
	JDBCUtil util;
	public IHouseDaoImpl(){
		util=new JDBCUtil();
	} 
	
	@Override
	public int save(House h) {
		String sql="insert into house(phone,housecity,houseaddr,housearea,housebedroom,househallroom,housebalconyroom,houserestroom,housekitchen,houselivingnum,housebedroomnum,housebeginliving,houseendliving) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return util.runSql(sql,h.getPhone(),h.getHousecity(),h.getHouseaddr(),h.getHousearea(),h.getHousebedroom(),h.getHousehallroom(),h.getHousebalconyroom(),h.getHouserestroom(),h.getHousekitchen(),h.getHouselivingnum(),h.getHousebedroomnum(),h.getHousebeginliving(),h.getHouseendliving());
	}

	@Override
	public House getHouseById(String phone) {
		return util.queryById(House.class, "select * from house where phone=?", phone);
	}
	
}
