package com.myblog.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.myblog.dao.AdminDao;
import com.myblog.model.TAdmin;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	public void saveAdmin(TAdmin admin) {
		this.getHibernateTemplate().save(admin);
	}

	public void removeAdmin(TAdmin admin) {
		this.getHibernateTemplate().delete(admin);
	}

	public TAdmin findAdminById(int id) {
		return (TAdmin)this.getHibernateTemplate().get(TAdmin.class, id);
	}

	public List<TAdmin> findAllAdmins() {
		return (List<TAdmin>)this.getHibernateTemplate().find("from TAdmin");
	}

	public void updateAdmin(TAdmin admin) {
		this.getHibernateTemplate().update(admin);

	}

	public List<TAdmin> findAdminByUserName(String userName) {
		return (List<TAdmin>)this.getHibernateTemplate().find("from TAdmin admin where admin.userName=?",userName);
	}

	public List<TAdmin> finAdminByNamePass(String userName, String password) {
		String hql = String.format("from TAdmin admin where admin.userName='%s' and admin.password='%s'",userName,password);
		System.out.println(hql);
		return (List<TAdmin>)this.getHibernateTemplate().find(hql);
	}


}
