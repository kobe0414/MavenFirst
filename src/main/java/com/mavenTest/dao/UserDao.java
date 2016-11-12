package com.mavenTest.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.mavenTest.entity.User;

public interface UserDao {

	public User getUser(String username);
}
