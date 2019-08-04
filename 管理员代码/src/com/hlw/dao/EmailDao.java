package com.hlw.dao;
import java.util.*;
import com.hlw.entries.Email;;
public interface EmailDao {
	public List<Email> allEmail(String name,String address,String content,String telephone,String email1);
}
