package deepspring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import deepspring.bean.MyTestBean;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr() + "234");
	}

}
