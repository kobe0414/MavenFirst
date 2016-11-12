package com.mavenTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mavenTest.dao.UserDao;
import com.mavenTest.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return userDao.getUser(username);
	}

}
