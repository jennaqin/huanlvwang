package com.hlw.service;

import java.util.List;

import com.hlw.entries.Email;

public interface IEmailServer {
	public List<Email> emails(String name,String address,String content,String telephone,String email1);
}
