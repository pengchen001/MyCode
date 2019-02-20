package cn.mycode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
	@RequestMapping("/show")
	public String show(){
		return "index";
	}

}
