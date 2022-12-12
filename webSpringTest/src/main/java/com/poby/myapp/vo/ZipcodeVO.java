package com.poby.myapp.vo;

public class ZipcodeVO {
	private String zipcode;
	private String city;
	private String street;
	private int bldg1;
	private int bldg2;
	private String bldgname;
	private String dong;
	private int num1;
	private int num2;
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getBldg1() {
		return bldg1;
	}
	public void setBldg1(int bldg1) {
		this.bldg1 = bldg1;
	}
	public int getBldg2() {
		return bldg2;
	}
	public void setBldg2(int bldg2) {
		this.bldg2 = bldg2;
	}
	public String getBldgname() {
		return bldgname;
	}
	public void setBldgname(String bldgname) {
		this.bldgname = bldgname;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "ZipcodeVO [zipcode=" + zipcode + ", city=" + city + ", street=" + street + ", bldg1=" + bldg1
				+ ", bldg2=" + bldg2 + ", bldgname=" + bldgname + ", dong=" + dong + ", num1=" + num1 + ", num2=" + num2
				+ "]";
	}
	
}
