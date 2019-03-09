package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * 使用外置的Tomcat启动时需要配置
 * @author 走遍千里
 * 若打包成war包,则需要配置
 * 
 * jar包和war包启动区别
 * jar包:执行SpringBootApplication的run方法,启动IOC容器,然后创建嵌入式Servlet容器
 * war包:先是启动Servlet服务器,服务器启动Springboot应用(springBootServletInitizer),然后启动IOC容器
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootSwaggerApplication.class);
	}

}
