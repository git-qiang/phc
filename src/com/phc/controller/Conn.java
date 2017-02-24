package com.phc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		
		Boolean b = ts.login(username, password);
		return "MyJsp12312312312";
	}
}
