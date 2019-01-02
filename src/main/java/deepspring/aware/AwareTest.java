package deepspring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class AwareTest implements BeanFactoryAware, BeanNameAware, BeanClassLoaderAware {
	
	private String beanName;
	
	private ClassLoader classLoader;
	
	private BeanFactory beanFactory;
	

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public void testAware() {
		Hello hello  = (Hello) beanFactory.getBean("hello");
		hello.say();
	}

	public void setBeanName(String name) {
		this.beanName = name;
		
	}

	public void setBeanClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
		
	}
	
	public void inita() {
		System.out.println("inita");
	}

}
