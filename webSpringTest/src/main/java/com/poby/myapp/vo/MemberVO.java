package com.poby.myapp.vo;

public class MemberVO {
	private String username;
	private String password;
	private String name;
	
	private String tel;
	private String tel1;
	private String tel2;
	private String tel3;
	
	private String email;
	private String zipcode;
	private String addr;
	private String detailaddr;
	private String regdate;
	
	@Override
	public String toString() {
		return "MemberVO [username=" + username + ", password=" + password + ", name=" + name + ", tel=" + tel
				+ ", email=" + email + ", zipcode=" + zipcode + ", addr=" + addr + ", detailaddr=" + detailaddr
				+ ", regdate=" + regdate + "]";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		tel = tel1+"-"+tel2+"-"+tel3;
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
		String t[] = tel.split("-");
		tel1 = t[0];
		tel2 = t[1];
		tel3 = t[2];
	}
	
	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTel3() {
		return tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetailaddr() {
		return detailaddr;
	}
	public void setDetailaddr(String detailaddr) {
		this.detailaddr = detailaddr;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
