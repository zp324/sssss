package springDemo;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ts.sd.HelloSpring;
import com.ts.sd.aop.User;
import com.ts.sd.aop.UserService;
import com.ts.sd.print.Printer;

public class TestSpring {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloSpring hs = (HelloSpring)ac.getBean("hs");
		
		hs.hello();
	}
	
	@Test
	public void test_printer() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Printer printer = (Printer)ac.getBean("printer");
		
		printer.info();
	}
	
	@Test
	public void test_aop() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService us = (UserService)ac.getBean("userService");
		
		us.addUser(new User());
	}

}
