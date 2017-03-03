package com.phc.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phc.dao.TD;
import com.phc.model.User;
import com.phc.service.TS;


@Service
public class TSImpl implements TS{
	
	@Autowired
	private TD td;
	
	private static final Logger logger = Logger.getLogger(TSImpl.class);
	
	
	
	public boolean login(List<User> user) {
		
		int i = td.addUser(user);
		
		return false;
	}

}
