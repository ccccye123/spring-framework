package org.springframework.ccccye;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.ccccye.IocService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class AutowiredTest {

	@Test
	public void autotest(){
		// Spring Framework 的方式
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("test.xml"));
		Man man = factory.getBean("man", Man.class);
		man.eat();

		// Spring Boot 的方式
//		ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");
//		IocService service = context.getBean("iocService", IocService.class);
//		System.out.println("count:" + service.getCount());
	}
}
