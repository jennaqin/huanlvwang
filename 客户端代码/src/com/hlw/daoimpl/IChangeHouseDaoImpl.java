package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IChangeHouseDao;
import com.hlw.entries.House;
import com.rock.util.JDBCUtil;

public class IChangeHouseDaoImpl implements IChangeHouseDao{
	JDBCUtil util;
	public IChangeHouseDaoImpl(){
		util=new JDBCUtil();
	} 
	public int alterhcity(House house){
		String str = house.getPhone();System.out.println("-------------------");System.out.println(str);
		String sql = "update house set housecity=? where phone='"+str+"'";
		return util.runSql(sql, house.getHousecity());
	}
	public int alterhaddress(House house){
		String str = house.getPhone();
		String sql = "update house set houseaddr=? where phone='"+str+"'";
		return util.runSql(sql, house.getHouseaddr());
	}
	public int alterharea(House house){
		String str = house.getPhone();
		String sql = "update house set housearea=? where phone='"+str+"'";
		return util.runSql(sql, house.getHousearea());
	}
	public int alterhbedroom(House house){
		String str = house.getPhone();
		String sql = "update house set housebedroom=? where phone='"+str+"'";
		return util.runSql(sql, house.getHousebedroom());
	}
	public int alterhlivingroom(House house){
		String str = house.getPhone();
		String sql = "update house set househallroom=? where phone='"+str+"'";
		return util.runSql(sql, house.getHousehallroom());
	}
	public int alterhbalcony(House house){
		String str = house.getPhone();
		String sql = "update house set housebalconyroom=? where phone='"+str+"'";
		return util.runSql(sql, house.getHousebalconyroom());
	}
	public int alterhwashingroom(House house){
		String str = house.getPhone();
		String sql = "update house set houserestroom=? where phone='"+str+"'";
		return util.runSql(sql, house.getHouserestroom());
	}
	public int alterhkitchen(House house){
		String str = house.getPhone();
		String sql = "update house set housekitchen=? where phone='"+str+"'";
		return util.runSql(sql, house.getHousekitchen());
	}
	public int alterhlivingnum(House house){
		String str = house.getPhone();
		String sql = "update house set houselivingnum=? where phone='"+str+"'";
		return util.runSql(sql, house.getHouselivingnum());
	}
	public int alterhbednum(House house){
		String str = house.getPhone();
		String sql = "update house set housebedroomnum=? where phone='"+str+"'";
		return util.runSql(sql, house.getHousebedroomnum());
	}
	public int alterhlivingstart(House house){
		String str = house.getPhone();
		String sql = "update house set housebeginliving=? where phone='"+str+"'";
		return util.runSql(sql, house.getHousebeginliving());
	}
	public int alterhlivingfinish(House house){
		String str = house.getPhone();
		String sql = "update house set houseendliving=? where phone='"+str+"'";
		return util.runSql(sql, house.getHouseendliving());
	}
}
