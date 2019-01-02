package deepspring.application;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext extends ClassPathXmlApplicationContext{
	
	public MyApplicationContext(String configLocations) {
		super(configLocations);
	}
	
	
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
	
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("JAVA_HOME");
	}
	
	

}
