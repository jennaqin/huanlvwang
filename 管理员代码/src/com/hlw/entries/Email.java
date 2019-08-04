package com.hlw.entries;

public class Email {
	public Email() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Email(String name, String address, String content, String telephone, String email1) {
		super();
		this.name = name;
		this.address = address;
		this.content = content;
		this.telephone = telephone;
		this.email1 = email1;
	}
	private String name;
	private String address;
	private String content;
	private String telephone;
	private String email1;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Email [name=" + name + ", address=" + address + ", content=" + content + ", telephone=" + telephone
				+ ", email1=" + email1 + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the email1
	 */
	public String getEmail1() {
		return email1;
	}
	/**
	 * @param email1 the email1 to set
	 */
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	
}
