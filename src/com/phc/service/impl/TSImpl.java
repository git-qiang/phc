package com.phc.service.impl;

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
	public boolean login(String username, String password) {
		User user = td.login(username, password);
		if(user.getUsername().equals("admin1")){
			return true;
		}else{
			try {
				throw new Exception();
			} catch (Exception e) {
				logger.error("´íÎó", e);
			}
		}
		return false;
	}

}
