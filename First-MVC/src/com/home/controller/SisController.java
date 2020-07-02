package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/makeup")
	public String makeup() {
		return "ok...Here is your mackup kit";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String Book() {
		System.out.println("It is the math()..");
		return "MathBook";
	}
}
