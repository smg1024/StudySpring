package com.poby.myapp.vo;

import java.util.List;

public class DataVO {
	private int postno;
	private String username;
	private String subject;
	private String content;
	private int hitcount;
	private String regdate;
	private String filename1;
	private String filename2;
	
	// 삭제할 파일 목록
	// private String[] delFile;
	private List<String> delFile;
	
	
	@Override
	public String toString() {
		return "DataVO [postno=" + postno + ", username=" + username + ", subject=" + subject + ", content=" + content
				+ ", hitcount=" + hitcount + ", regdate=" + regdate + ", filename1=" + filename1 + ", filename2="
				+ filename2 + ", delFile=" + delFile + "]";
	}
	public int getPostno() {
		return postno;
	}
	public void setPostno(int postno) {
		this.postno = postno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getFilename1() {
		return filename1;
	}
	public void setFilename1(String filename1) {
		this.filename1 = filename1;
	}
	public String getFilename2() {
		return filename2;
	}
	public void setFilename2(String filename2) {
		this.filename2 = filename2;
	}
	public List<String> getDelFile() {
		return delFile;
	}
	public void setDelFile(List<String> delFile) {
		this.delFile = delFile;
	}
}
