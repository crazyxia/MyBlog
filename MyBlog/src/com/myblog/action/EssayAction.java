package com.myblog.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.myblog.model.TEssay;
import com.myblog.service.EssayListService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EssayAction extends ActionSupport {
	private EssayListService essayListService;

	public EssayListService getEssayListService() {
		return essayListService;
	}
	public void setEssayListService(EssayListService essayListService) {
		this.essayListService = essayListService;
	}
	
	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt((String)request.getParameter("id"));
		((Map<String, TEssay>)ActionContext.getContext().get("request")).put("essay", this.essayListService.findById(id));
		return SUCCESS;
	}
}
