package com.poby.myapp.vo;

public class CommentVO {
	private int replyno;
	private int postno;
	private String username;
	private String content;
	private String regdate;
	
	@Override
	public String toString() {
		return "CommentVO [replyno=" + replyno + ", postno=" + postno + ", username=" + username + ", content="
				+ content + ", regdate=" + regdate + "]";
	}
	
	public int getReplyno() {
		return replyno;
	}
	public void setReplyno(int replyno) {
		this.replyno = replyno;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
