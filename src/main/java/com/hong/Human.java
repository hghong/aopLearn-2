package com.hong;

import org.springframework.stereotype.Component;

@Component
public class Human implements Sleepable {
	public Human(){}
	
	public void sleep() {
		System.out.println("跟周公女儿约会ing");
	}
}