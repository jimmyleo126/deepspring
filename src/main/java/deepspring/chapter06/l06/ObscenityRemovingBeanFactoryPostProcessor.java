package deepspring.chapter06.l06;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	
	private Set<String> obscenties;
	
	public ObscenityRemovingBeanFactoryPostProcessor() {
		this.obscenties = new HashSet<String>();
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
			StringValueResolver stringValueResolver = new StringValueResolver() {

				@Override
				public String resolveStringValue(String strVal) {
					if(isObscene(strVal)) {
						return "****";
					}
					return strVal;
				}
			};
			BeanDefinitionVisitor beanDefinitionVisitor = new BeanDefinitionVisitor(stringValueResolver);
			beanDefinitionVisitor.visitBeanDefinition(beanDefinition);
		}
	}
	
	public boolean isObscene(Object value) {
		String potentialObscenity = value.toString().toUpperCase();
		return this.obscenties.contains(potentialObscenity);
	}
	
	public void setObscenties(Set<String> obscenties) {
		this.obscenties.clear();
		for (String obscenity : obscenties) {
			this.obscenties.add(obscenity.toUpperCase());
		}
	}

}