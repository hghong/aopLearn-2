package com.hong;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SleepHelper {
	@Pointcut("execution(* com.hong..sleep(..))")
	public void point() {
	}

	@Before("point()")
	public void before(JoinPoint joinPoint) throws Throwable {
		System.out.println("睡前来一发");
	}

	@AfterReturning("point()")
	public void afterReturning() throws Throwable {
		System.out.println("起床了，刷牙洗脸");
	}

	@After("point()")
	public void after() throws Throwable {
		System.out.println("天亮了 ?");
	}
}