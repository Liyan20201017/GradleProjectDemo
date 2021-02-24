package com.aring.dao;

import java.util.List;

import com.aring.pojo.User;

public interface UserMapper {
	public User selectByPrimaryKey(int userid);

	public int saveUser(User user);

	public User userLogin(User user);

	public List<User> show();

	public int delete(String id);

	public int add(User user);

	public int upd(User user);
}
