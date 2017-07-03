package com.myblog.service;

import java.util.List;
import com.myblog.model.TEssay;

public interface EssayListService {
	List<TEssay> findAll();
	void save(TEssay essay);
	void delete(TEssay essay);
	TEssay findById(int id);
	void update(TEssay essay);
}
