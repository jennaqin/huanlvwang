package com.hlw.entries;

import java.sql.Blob;
import java.sql.Date;

public class House {
	private String phone;//锟街伙拷锟斤拷
	private String housecity;//锟斤拷锟斤拷
	private String houseaddr;//锟斤拷址
	private String housearea;//锟斤拷锟�
	private String housebedroom ;//锟斤拷锟斤拷
	private String househallroom;//锟斤拷
	private String housebalconyroom;//锟斤拷台
	private String houserestroom;//锟斤拷锟斤拷锟斤拷
	private String housekitchen;//锟斤拷锟斤拷
	private String houselivingnum;//锟斤拷住锟斤拷锟斤拷
	private String housebedroomnum;//锟斤拷锟斤拷
	private String housebeginliving; //锟斤拷始锟斤拷住锟斤拷锟斤拷
	private String houseendliving;//锟斤拷锟斤拷锟斤拷住锟斤拷锟斤拷
	
	public House(String housecity, String houseaddr, String housearea, String housebedroom, String househallroom,
			String housebalconyroom, String houserestroom, String housekitchen, String houselivingnum,
			String housebedroomnum, String housebeginliving, String houseendliving) {
		super();
		this.housecity = housecity;
		this.houseaddr = houseaddr;
		this.housearea = housearea;
		this.housebedroom = housebedroom;
		this.househallroom = househallroom;
		this.housebalconyroom = housebalconyroom;
		this.houserestroom = houserestroom;
		this.housekitchen = housekitchen;
		this.houselivingnum = houselivingnum;
		this.housebedroomnum = housebedroomnum;
		this.housebeginliving = housebeginliving;
		this.houseendliving = houseendliving;
	}


	public House() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public House(String phone, String housecity, String houseaddr, String housearea, String housebedroom,
			String househallroom, String housebalconyroom, String houserestroom, String housekitchen,
			String houselivingnum, String housebedroomnum, String housebeginliving, String houseendliving) {
		super();
		this.phone = phone;
		this.housecity = housecity;
		this.houseaddr = houseaddr;
		this.housearea = housearea;
		this.housebedroom = housebedroom;
		this.househallroom = househallroom;
		this.housebalconyroom = housebalconyroom;
		this.houserestroom = houserestroom;
		this.housekitchen = housekitchen;
		this.houselivingnum = houselivingnum;
		this.housebedroomnum = housebedroomnum;
		this.housebeginliving = housebeginliving;
		this.houseendliving = houseendliving;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getHousecity() {
		return housecity;
	}



	public void setHousecity(String housecity) {
		this.housecity = housecity;
	}



	public String getHouseaddr() {
		return houseaddr;
	}



	public void setHouseaddr(String houseaddr) {
		this.houseaddr = houseaddr;
	}



	public String getHousearea() {
		return housearea;
	}



	public void setHousearea(String housearea) {
		this.housearea = housearea;
	}



	public String getHousebedroom() {
		return housebedroom;
	}



	public void setHousebedroom(String housebedroom) {
		this.housebedroom = housebedroom;
	}



	public String getHousehallroom() {
		return househallroom;
	}



	public void setHousehallroom(String househallroom) {
		this.househallroom = househallroom;
	}



	public String getHousebalconyroom() {
		return housebalconyroom;
	}



	public void setHousebalconyroom(String housebalconyroom) {
		this.housebalconyroom = housebalconyroom;
	}



	public String getHouserestroom() {
		return houserestroom;
	}



	public void setHouserestroom(String houserestroom) {
		this.houserestroom = houserestroom;
	}



	public String getHousekitchen() {
		return housekitchen;
	}



	public void setHousekitchen(String housekitchen) {
		this.housekitchen = housekitchen;
	}



	public String getHouselivingnum() {
		return houselivingnum;
	}



	public void setHouselivingnum(String houselivingnum) {
		this.houselivingnum = houselivingnum;
	}



	public String getHousebedroomnum() {
		return housebedroomnum;
	}



	public void setHousebedroomnum(String housebedroomnum) {
		this.housebedroomnum = housebedroomnum;
	}



	public String getHousebeginliving() {
		return housebeginliving;
	}



	public void setHousebeginliving(String housebeginliving) {
		this.housebeginliving = housebeginliving;
	}



	public String getHouseendliving() {
		return houseendliving;
	}



	public void setHouseendliving(String houseendliving) {
		this.houseendliving = houseendliving;
	}



	

	
	
	
	
	
}
