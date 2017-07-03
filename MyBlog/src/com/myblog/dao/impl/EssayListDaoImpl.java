package com.myblog.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myblog.dao.EssayListDao;
import com.myblog.model.TEssay;

public class EssayListDaoImpl extends HibernateDaoSupport implements
		EssayListDao {

	public void saveEssay(TEssay essay) {
		this.getHibernateTemplate().save(essay);
	}

	public void removeEssay(TEssay essay) {
		this.getHibernateTemplate().delete(essay);

	}

	public TEssay findEssayById(int id) {
		return (TEssay)this.getHibernateTemplate().get(TEssay.class, id);
	}

	public List<TEssay> findAllEssays() {
		return (List<TEssay>)this.getHibernateTemplate().find("from TEssay");
	}

	public void updateEssay(TEssay essay) {
		this.getHibernateTemplate().update(essay);
	}

}
