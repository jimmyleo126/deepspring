package deepspring.chapter06.l06;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.io.ClassPathResource;

import deepspring.chapter06.l05.UserManager;

public class Test {

	public static void main(String[] args) {
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("chapter06/l06/beanFactoryTest.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("chapter06/l06/beanFactoryTest.xml");
//		HelloMessage userManager = (HelloMessage) context.getBean("message");simpleBean
//		BeanFactoryPostProcessor bfpp = (BeanFactoryPostProcessor) bf.getBean("bfpp");
//		bfpp.postProcessBeanFactory((ConfigurableListableBeanFactory) bf);
//		SimplePostProcess simplePostProcess = (SimplePostProcess) context.getBean("simpleBean");
//		System.out.println(simplePostProcess);
		
		
//		Locale locale = Locale.CHINA;
//		System.out.println(locale);
//		Locale locale1 = new Locale("zh", "CN");
//		System.out.println(locale1);
//		Locale locale2 = Locale.getDefault();
//		System.out.println(locale2);
		
//		String pattern1 = "{0}, 你好！你于{1}在工商银行存入{2} 元。。";
//		String pattern2 = "At {1, time, short} On {1, date, long}, {0} paid {2, number, currency}.";
//		
//		Object[] params = {"John liu", new GregorianCalendar().getTime()};
		
//		String msg1 = MessageFormat.format(pattern1, params);
//		
//		MessageFormat mf = new MessageFormat(pattern2, Locale.US);
//		String msg2 = mf.format(params);
//		
//		System.out.println(msg1);
//		System.out.println(msg2);
		
		
//		System.out.println(context.getMessage("test", params, Locale.US));
//		System.out.println(context.getMessage("test", params, Locale.getDefault()));
		
		/*TestEvent event = new TestEvent("hello", "msg");
		context.publishEvent(event);*/
		
		DefaultConversionService defaultConversionService = new DefaultConversionService();
		defaultConversionService.addConverter(new String2DateConverter());
		String dk = defaultConversionService.convert("1", String.class);
		System.out.println(dk);
		
	}

}
