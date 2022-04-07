package com.example.demo.mapper;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.main.BootVuePrjApplication;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootTest(classes =BootVuePrjApplication.class)
public class TimeMapperTest {

	@Autowired
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		 log.info("timeMapper class name: " + timeMapper.getClass().getName());
	     log.info("timeMapper time: " + timeMapper.getTime());	
	 }
	
    //XML 방식
    @Test
    public void testGetTime2() {
        log.info("getTime2");
        log.info("getTime2: " + timeMapper.getTime2());
    }	
	
}//class
