package com.cipon2u.zandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bp")
public class BusinessPartnerController {
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		return "hello world";
	}

}
