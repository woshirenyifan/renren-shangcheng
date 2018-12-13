package com.ryf.quartz;

import org.springframework.stereotype.Component;

@Component
public class MyJob {
	
	public void run(){
		System.out.println("quartz run start !");
	}
}
