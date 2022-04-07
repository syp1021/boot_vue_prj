package com.example.demo.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.example.demo.mapper"})
@SpringBootApplication
public class BootVuePrjApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootVuePrjApplication.class, args);
	}

}
