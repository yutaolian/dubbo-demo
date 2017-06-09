package com.phizs.dubbo.service.impl;

import com.phizs.dubbo.service.TestServiceI;

public class TestServiceImpl implements TestServiceI{

	@Override
	public String sayHello(String name) {
		return name + " say hello !!!!!";
	}

}
