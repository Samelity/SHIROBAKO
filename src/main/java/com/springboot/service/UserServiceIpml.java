package com.springboot.service;

import java.net.URI;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserDao;
import com.springboot.entity.User;
 
 
@Service
public class UserServiceIpml implements IUserService{
	@Autowired
	private UserDao userDao;
 
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}
}
