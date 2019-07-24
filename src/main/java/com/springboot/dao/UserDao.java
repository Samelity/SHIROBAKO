package com.springboot.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springboot.entity.User;
 
 
@Repository
public class UserDao {
 
	@Autowired
	private JdbcTemplate jdbcTemplate;
 
	public void addUser(User user) {
		String sql = "INSERT INTO `user` (`username`,`password`,`modify_datetime`) "
				+ "VALUES(?,?,now())";
		
		jdbcTemplate
				.update(sql,user.getUsername(),user.getPassword());		
	}
}