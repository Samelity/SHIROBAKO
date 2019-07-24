package com.springboot.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.service.IUserService;
 
//采用RestController，在返回时，如果registSucceful.jsp，直接返回这个页面，如果没有，直接返回该字符串
@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/user/regist")
	public String regist(String username,String password){
		User user = new User();
		user.setPassword(password);
		user.setUsername(username);
		userService.addUser(user);
		System.out.println("consle---/user/regist");
		return "registSucceful";
	}
	
}