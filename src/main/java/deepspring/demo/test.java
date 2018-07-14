package deepspring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import deepspring.bean.GetBeanTest;
import deepspring.bean.HelloBean;
import deepspring.bean.TestChangeMethod;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
//		GetBeanTest bean = (GetBeanTest) bf.getBean("getBeanTest");
//		bean.showMe();
		
		//ApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		
		HelloBean test = (HelloBean) bf.getBean("helloBean");
		//test.changeMe("wo shi liujing");
	}

}
