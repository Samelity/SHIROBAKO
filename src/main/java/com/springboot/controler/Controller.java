package com.springboot.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/")
	@ResponseBody
	public String hw() {
		return "第一个springboot！";
	}
}
