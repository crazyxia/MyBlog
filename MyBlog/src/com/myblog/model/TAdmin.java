package com.myblog.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TAdmin entity. @author MyEclipse Persistence Tools
 */

public class TAdmin implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String password;
	private Date lastLoginTime;
	private Set TVisitorMessages = new HashSet(0);

	// Constructors

	/** default constructor */
	public TAdmin() {
	}

	/** full constructor */
	public TAdmin(String userName, String password, Date lastLoginTime,
			Set TVisitorMessages) {
		this.userName = userName;
		this.password = password;
		this.lastLoginTime = lastLoginTime;
		this.TVisitorMessages = TVisitorMessages;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Set getTVisitorMessages() {
		return this.TVisitorMessages;
	}

	public void setTVisitorMessages(Set TVisitorMessages) {
		this.TVisitorMessages = TVisitorMessages;
	}

}