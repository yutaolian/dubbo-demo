package com.phizs.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phizs.dubbo.service.TestServiceI;

@Controller
public class TestController {
	
	@Autowired
	private TestServiceI testService;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return testService.sayHello("lyt");
	}

}
