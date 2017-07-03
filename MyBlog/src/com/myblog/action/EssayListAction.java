package com.myblog.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.myblog.model.TEssay;
import com.myblog.service.EssayListService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EssayListAction extends ActionSupport {
	private EssayListService essayListService;

	public EssayListService getEssayListService() {
		return essayListService;
	}
	public void setEssayListService(EssayListService essayListService) {
		this.essayListService = essayListService;
	}
	
	@Override
	public String execute() throws Exception {
		Map request = (Map)ActionContext.getContext().get("request");
		HttpServletRequest servletReq = ServletActionContext.getRequest();
		String temp=(String)servletReq.getParameter("page");
		System.out.println("page:"+temp);
		int page = Integer.parseInt(temp.trim());
		List<TEssay> list = this.essayListService.findAll();
		//总的文章数
		int count = list.size();
		//每页文章数
		int perCount=8;
		//总页数
		int pageCount = (int)Math.ceil(count/perCount);
		if(page<1 || page>pageCount)
		{
			page=1;
		}
		request.put("essayList",list.subList((page-1)*perCount,page*perCount));
		Map session = ServletActionContext.getContext().getSession();
		session.put("currentPage", page);
		return SUCCESS;
	}
}
