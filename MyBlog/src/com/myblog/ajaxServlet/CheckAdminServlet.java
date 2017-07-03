package com.myblog.ajaxServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.myblog.model.TAdmin;
import com.myblog.service.AdminService;

public class CheckAdminServlet extends HttpServlet {

	private AdminService adminService;
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}


	public CheckAdminServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("成功进入doPost");
		request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println("pwd:"+password);
		String info="";
		List<TAdmin> list = this.adminService.findByUserName(username);
		if(list!=null && list.size()>0)
		{
			if(password==null)
			{
				info="usernameOk";
			}
			else
			{
				for(int i=0;i<list.size();++i)
				{
					if(password.equals(list.get(i).getPassword()))
					{
						info="allOk";
					}
				}
			}
			
		}
		PrintWriter out = response.getWriter();
		out.print(info);
		out.flush();
		out.close();
	}

	public void init() throws ServletException {
		//强制spring注入
		ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		adminService = (AdminService) applicationContext.getBean("adminService");

	}
	

}
