package com.myblog.model;

import java.util.Date;

/**
 * TEssay entity. @author MyEclipse Persistence Tools
 */

public class TEssay implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String context;
	private Date writeTime;

	// Constructors

	/** default constructor */
	public TEssay() {
	}

	/** full constructor */
	public TEssay(String title, String context, Date writeTime) {
		this.title = title;
		this.context = context;
		this.writeTime = writeTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Date getWriteTime() {
		return this.writeTime;
	}

	public void setWriteTime(Date writeTime) {
		this.writeTime = writeTime;
	}

}