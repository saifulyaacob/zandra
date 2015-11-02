package com.cipon2u.zandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BusinessPartnerController {
	
	@ResponseBody
	 @RequestMapping("/")
	public String index(){
		return "hello world";
	}

}
