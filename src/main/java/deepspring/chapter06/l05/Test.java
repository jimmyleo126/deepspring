package deepspring.chapter06.l05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("chapter06/l05/beanFactoryTest.xml");
		UserManager userManager = (UserManager) context.getBean("userManager");
		System.out.println(userManager);
		
	}
}
