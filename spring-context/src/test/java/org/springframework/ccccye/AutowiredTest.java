package org.springframework.ccccye;

import org.junit.Test;
import org.springframework.ccccye.IocService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {

	@Test
	public void autotest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");
		IocService service = context.getBean("iocService", IocService.class);
		System.out.println("count:" + service.getCount());
	}
}
