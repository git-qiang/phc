package com.phc.service;

import org.apache.ibatis.annotations.Select;

public interface TS {
	
	public boolean login(String username,String password);
}
