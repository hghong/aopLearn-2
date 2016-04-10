package com.hong;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestHuman {
	@Resource(name="human")
	private Sleepable sleepable;
	
	@Resource
	private Human human;
	
	@Test
	public void testSleep()  {
		sleepable.sleep();
	}
	
	@Test
	public void testHumanSleep()  {
		human.sleep();
	}
}