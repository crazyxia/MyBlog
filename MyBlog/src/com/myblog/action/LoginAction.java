package com.myblog.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.myblog.model.TAdmin;
import com.myblog.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private TAdmin admin;
	private AdminService adminService;
	
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public TAdmin getAdmin() {
		return admin;
	}
	public void setAdmin(TAdmin admin) {
		this.admin = admin;
	}
	
	@Override
	public String execute() throws Exception {
		
		List<TAdmin> list = this.adminService.findByNamePass(admin.getUserName(), admin.getPassword());
		if(list!=null){
			ServletActionContext.getRequest().getSession().setAttribute("admin",list.get(0));
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
}
