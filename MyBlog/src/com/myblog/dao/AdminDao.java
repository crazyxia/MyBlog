package com.myblog.dao;

import java.util.List;
import com.myblog.model.TAdmin;

public interface AdminDao {
	void saveAdmin(TAdmin admin);
	void removeAdmin(TAdmin admin);
	TAdmin findAdminById(int id);
	List<TAdmin> findAdminByUserName(String userName);
	List<TAdmin> finAdminByNamePass(String userName,String password);
	List<TAdmin> findAllAdmins();
	void updateAdmin(TAdmin admin);
}
