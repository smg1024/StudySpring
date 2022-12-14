package com.poby.myapp.vo;

public class BoardVO {
	private int postno;
	private String subject;
	private String content;
	private String username;
	private String hitcount;
	private String ipAddr;
	private String regdate;
	@Override
	public String toString() {
		return "BoardVO [postno=" + postno + ", subject=" + subject + ", content=" + content + ", username=" + username
				+ ", hitcount=" + hitcount + ", ipAddr=" + ipAddr + ", regdate=" + regdate + "]";
	}
	public int getPostno() {
		return postno;
	}
	public void setPostno(int postno) {
		this.postno = postno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHitcount() {
		return hitcount;
	}
	public void setHitcount(String hitcount) {
		this.hitcount = hitcount;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
