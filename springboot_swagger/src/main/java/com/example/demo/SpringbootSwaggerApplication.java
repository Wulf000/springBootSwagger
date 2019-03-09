package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * springboot启动类
 * @author 走遍千里
 */
@SpringBootApplication
//如果swagger的配置文件里没有指定包名，此处必须指定
//@ComponentScan(basePackages = {"com.example.demo"})
public class SpringbootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwaggerApplication.class, args);
	}
}
