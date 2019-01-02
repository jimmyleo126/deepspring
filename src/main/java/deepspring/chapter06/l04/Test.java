package deepspring.chapter06.l04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("chapter06/l04/beanFactoryTest.xml");
//		Teacher teacher = new Teacher();
//		teacher.saySomething();
		Teacher teacher = (Teacher) context.getBean("teacher");
		teacher.saySomething();
//		teacher.Test();
	}

}
