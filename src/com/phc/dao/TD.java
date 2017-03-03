package com.phc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.phc.model.User;



@Repository
public interface TD {
	@Select({"select username from user where id='1'"})
	public User login(String username,String password);
	
	@InsertProvider(type=TDSqlProvider.class,method="addUser")
	public int addUser(@Param("user")List<User> user);
}
