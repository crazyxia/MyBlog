package com.myblog.dao;

import java.util.List;
import com.myblog.model.TEssay;

public interface EssayListDao {
	void saveEssay(TEssay essay);
	void removeEssay(TEssay essay);
	TEssay findEssayById(int id);
	List<TEssay> findAllEssays();
	void updateEssay(TEssay essay);
}
