package com.ts.sd.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ts.sd.print.Printer;
@Component("usl")
@Aspect
public class UserServiceLogging {
	private Logger log = LoggerFactory.getLogger(Printer.class);
	@Pointcut("execution(* com.ts.sd.aop..*.*(..))")
	public void pc() {}
	
	@Before("pc()")
	public void before(JoinPoint jp) {
		log.info("����{}����ķ���{},�������{}",jp.getTarget(),jp.getSignature().getName(),Arrays.toString(jp.getArgs()));
	}
	@AfterReturning(value="pc()",returning="result")
	public void afterRuturning(JoinPoint jp,Object result) {
		log.info("����{}����ķ���{},�����ķ���ֵ{}",jp.getTarget(),jp.getSignature().getName(),result);
	}
	@AfterThrowing(value="pc()",throwing="e")
	public void afterThrowing(JoinPoint jp,Throwable e) {
		log.info("����{}����ķ���{},�׳��쳣��Ϣ{}",jp.getTarget(),jp.getSignature().getName(),e.getMessage());
	}
	@After("pc()")
	public void after(JoinPoint jp) {
		log.info("����{}����ķ���{},����ִ�н�����",jp.getTarget(),jp.getSignature().getName());
	}
	@Around("pc()")
	public void around(ProceedingJoinPoint jp) {
		try {
			log.info("����{}����ķ���{},�������{}",jp.getTarget(),jp.getSignature().getName(),Arrays.toString(jp.getArgs()));
			Object result = jp.proceed();
			log.info("����{}����ķ���{},�����ķ���ֵ{}",jp.getTarget(),jp.getSignature().getName(),result);
		} catch (Throwable e) {
			//e.printStackTrace();
			log.info("����{}����ķ���{},�׳��쳣��Ϣ{}",jp.getTarget(),jp.getSignature().getName(),e.getMessage());
		} finally {
			log.info("����{}����ķ���{},����ִ�н�����",jp.getTarget(),jp.getSignature().getName());
		}
	}
}
