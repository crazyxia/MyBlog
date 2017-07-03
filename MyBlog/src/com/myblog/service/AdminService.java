package com.myblog.service;

import java.util.List;
import com.myblog.model.TAdmin;

public interface AdminService {
	List<TAdmin> findAll();
	List<TAdmin> findByUserName(String userName);
	List<TAdmin> findByNamePass(String userName,String password);
	void save(TAdmin admin);
	void delete(TAdmin admin);
	TAdmin findById(int id);
	void update(TAdmin admin);
}
