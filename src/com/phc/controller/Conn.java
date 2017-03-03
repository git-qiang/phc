package com.phc.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phc.model.User;
import com.phc.service.TS;

@Controller
@RequestMapping({"/"})
public class Conn {
	
	private static final Logger logger = Logger.getLogger(Conn.class);
	
	@Autowired
	private TS ts;
	
	@RequestMapping({"login"})
	@ResponseBody
	public String login(Model model,String username,String password){
		logger.info("µÇÂ½¿ªÊ¼--TCImpl.login");
		model.addAttribute("sdfds", username);
		
		
		List<User> u = new ArrayList<User>();
		u.add(new User("111","111","123","123","123"));
		u.add(new User("222","222","123","123","123"));
		u.add(new User("3333","111","123","123","123"));
		
		Boolean b = ts.login(u);
		return "MyJsp";
	}
}
