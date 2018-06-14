package com.web.kong.DTO;

public class BoardiDTO {
	
	private String boardnum;
	public String getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(String boardnum) {
		this.boardnum = boardnum;
	}
	private String subject;
	private String writer;
	private String contentq;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContentq() {
		return contentq;
	}
	public void setContentq(String contentq) {
		this.contentq = contentq;
	}

}
