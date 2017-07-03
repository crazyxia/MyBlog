package com.myblog.service.impl;

import java.util.List;

import com.myblog.dao.AdminDao;
import com.myblog.model.TAdmin;
import com.myblog.service.AdminService;

public class AdminServiceImpl implements AdminService {
	
	private AdminDao adminDao;
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	
	public List<TAdmin> findAll() {
		return this.adminDao.findAllAdmins();
	}

	public void save(TAdmin admin) {
		this.adminDao.saveAdmin(admin);

	}

	public void delete(TAdmin admin) {
		this.adminDao.removeAdmin(admin);

	}

	public TAdmin findById(int id) {
		return this.adminDao.findAdminById(id);
	}

	public void update(TAdmin admin) {
		this.adminDao.updateAdmin(admin);

	}

	public List<TAdmin> findByUserName(String userName) {
		return (List<TAdmin>)this.adminDao.findAdminByUserName(userName);
	}

	public List<TAdmin> findByNamePass(String userName, String password) {
		return (List<TAdmin>)this.adminDao.finAdminByNamePass(userName,password);
	}

}
