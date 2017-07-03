package com.myblog.model;

import java.util.Date;

/**
 * TVisitorMessage entity. @author MyEclipse Persistence Tools
 */

public class TVisitorMessage implements java.io.Serializable {

	// Fields

	private Integer id;
	private TAdmin TAdmin;
	private String visitorName;
	private String visitorMessage;
	private Date visitTime;

	// Constructors

	/** default constructor */
	public TVisitorMessage() {
	}

	/** minimal constructor */
	public TVisitorMessage(TAdmin TAdmin) {
		this.TAdmin = TAdmin;
	}

	/** full constructor */
	public TVisitorMessage(TAdmin TAdmin, String visitorName,
			String visitorMessage, Date visitTime) {
		this.TAdmin = TAdmin;
		this.visitorName = visitorName;
		this.visitorMessage = visitorMessage;
		this.visitTime = visitTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TAdmin getTAdmin() {
		return this.TAdmin;
	}

	public void setTAdmin(TAdmin TAdmin) {
		this.TAdmin = TAdmin;
	}

	public String getVisitorName() {
		return this.visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorMessage() {
		return this.visitorMessage;
	}

	public void setVisitorMessage(String visitorMessage) {
		this.visitorMessage = visitorMessage;
	}

	public Date getVisitTime() {
		return this.visitTime;
	}

	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}

}