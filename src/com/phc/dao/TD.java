package com.phc.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.phc.model.User;



@Repository
public interface TD {
	@Select({"select username from user where id='1'"})
	public User login(String username,String password);
}
