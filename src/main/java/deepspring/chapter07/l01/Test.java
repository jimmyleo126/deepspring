package deepspring.chapter07.l01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	
	public Test() {
		
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("chapter07/l01/beanFactoryTest.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("chapter07/l01/beanFactoryTest.xml");
//		
		TestBean tb = (TestBean) context.getBean("test");
		tb.test();
		
	
	}
	
	private void tt() {
		System.out.println("tt");
	}

}
