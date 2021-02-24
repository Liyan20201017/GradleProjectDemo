package com.aring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aring.dao.UserMapper;
import com.aring.pojo.User;
import com.aring.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int register(User user) {
		return userMapper.saveUser(user);
	}

	@Override
	public User login(User user) {
		return userMapper.userLogin(user);
	}

	@Override
	public List<User> show() {
		return userMapper.show();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return userMapper.delete(id);
	}

	@Override
	public int add(User user) {
		return userMapper.add(user);
	}

	@Override
	public int upd(User user) {
		// TODO Auto-generated method stub
		return userMapper.upd(user);
	}

}
