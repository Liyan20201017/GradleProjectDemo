package com.aring.service;

import java.util.List;

import com.aring.pojo.User;

public interface UserService {

	public User getUserById(int userId);

	public int register(User user);

	public User login(User user);

	public List<User> show();

	public int delete(String id);

	public int add(User user);

	public int upd(User user);
}
