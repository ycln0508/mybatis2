package com.tarena.mapper;

import java.util.List;

import com.tarena.entity.User;

public interface UserDao {
	public User findByName(String name);
	public int save(User user);
	User findPassword(String userId);
	int updatapassword(User user);
	List<User> findUsers();
}
