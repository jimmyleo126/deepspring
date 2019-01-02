package deepspring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import deepspring.dependency.TestA;

public class PostProcessorTest implements BeanPostProcessor {
	
	@Autowired
	private TestA testA;
	
	public PostProcessorTest() {
		System.out.println("PostProcessorTest had stated!");
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println(beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println(beanName);
		return bean;
	}

}
