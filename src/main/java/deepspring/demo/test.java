package deepspring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import deepspring.application.MyApplicationContext;
import deepspring.aware.AwareTest;
import deepspring.bean.Car;
import deepspring.bean.TestChangeMethod;
import deepspring.dependency.TestA;
import deepspring.factory.CarFactoryBean;
import deepspring.processor.PostProcessorTest;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BeanFactory mbf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
//		GetBeanTest bean = (GetBeanTest) bf.getBean("getBeanTest");
//		bean.showMe();
		
//		ApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		
		ApplicationContext mbf = new MyApplicationContext("beanFactoryTest.xml");
		
		PostProcessorTest test = (PostProcessorTest) mbf.getBean("myBeanPost");
		System.out.println("");
	}

}
