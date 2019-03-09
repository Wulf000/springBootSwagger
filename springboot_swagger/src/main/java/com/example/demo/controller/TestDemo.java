package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * springboot测试controller
 * @author 走遍千里
 */
@Controller
@RequestMapping("/demo")
@Api(value = "Test测试接口", description = "Test测试接口")
public class TestDemo {

	/**
	 * 测试访问index页面
	 * @return
	 */
	@ApiOperation("/获取index页面")
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String name() {
		
		System.out.println(123);
		return "index";
	}
	
	/**
	 * 测试访问login.html页面
	 * @return
	 */
	@ApiOperation("/获取login页面")
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login() {
		
		return "login";
	}
	
	
}
