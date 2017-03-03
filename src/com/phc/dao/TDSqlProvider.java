package com.phc.dao;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

import com.phc.model.User;

public class TDSqlProvider {
	public String addUser(Map map){
		List<User> user = (List<User>)map.get("user");
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO user ");
		sb.append("(username , password) ");
		sb.append("VALUES "); 
		MessageFormat mf = new MessageFormat("( #'{'user[{0}].username}, #'{'user[{0}].password})");
		for (int i = 0; i < user.size(); i++) {
			sb.append(mf.format(new Object[] { Integer.valueOf(i) }));
			if (i < user.size() - 1) {
				sb.append(",");
			}
		}
		return sb.toString();		
		
	}
}
