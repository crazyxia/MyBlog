package com.myblog.service.impl;

import java.util.List;

import com.myblog.dao.EssayListDao;
import com.myblog.model.TEssay;
import com.myblog.service.EssayListService;

public class EssayListServiceImpl implements EssayListService {
	private EssayListDao essayListDao;
	
	public EssayListDao getEssayListDao() {
		return essayListDao;
	}

	public void setEssayListDao(EssayListDao essayListDao) {
		this.essayListDao = essayListDao;
	}

	public List<TEssay> findAll() {
		return this.essayListDao.findAllEssays();
	}

	public void save(TEssay essay) {
		this.essayListDao.saveEssay(essay);
	}

	public void delete(TEssay essay) {
		this.essayListDao.removeEssay(essay);
	}

	public TEssay findById(int id) {
		return this.essayListDao.findEssayById(id);
	}

	public void update(TEssay essay) {
		this.essayListDao.updateEssay(essay);
	}

}
