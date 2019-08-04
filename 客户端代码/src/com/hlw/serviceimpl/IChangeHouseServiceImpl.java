package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IChangeHouseDao;
import com.hlw.daoimpl.IChangeHouseDaoImpl;
import com.hlw.entries.House;
import com.hlw.service.IChangeHouseService;


public class IChangeHouseServiceImpl implements IChangeHouseService {
	IChangeHouseDao chdao;
	public IChangeHouseServiceImpl() {
		chdao = new IChangeHouseDaoImpl();
	}
	public int alterhcity(House house){
		return chdao.alterhcity(house);
	}
	public int alterhaddress(House house){
		return chdao.alterhaddress(house);
	}
	public int alterharea(House house){
		return chdao.alterharea(house);
	}
	public int alterhbedroom(House house){
		return chdao.alterhbedroom(house);
	}
	public int alterhlivingroom(House house){
		return chdao.alterhlivingroom(house);
	}
	public int alterhbalcony(House house){
		return chdao.alterhbalcony(house);
	}
	public int alterhwashingroom(House house){
		return chdao.alterhwashingroom(house);
	}
	public int alterhkitchen(House house){
		return chdao.alterhkitchen(house);
	}
	public int alterhlivingnum(House house){
		return chdao.alterhlivingnum(house);
	}
	public int alterhbednum(House house){
		return chdao.alterhbednum(house);
	}
	public int alterhlivingstart(House house){
		return chdao.alterhlivingstart(house);
	}
	public int alterhlivingfinish(House house){
		return chdao.alterhlivingfinish(house);
	}
}
