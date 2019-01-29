package deepspring.chapter09.l03;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.support.StaticWebApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("chapter09/l03/beanFactoryTest.xml");
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("chapter09/l03/beanFactoryTest.xml");
		UserMapper userDao = (UserMapper) context.getBean("userMapper");
		User user = userDao.getUser(9);
		User uu = new User();
		BeanUtils.copyProperties(user, uu);
		System.out.println(userDao.getUser(9).getName());
		
		
		
	}

}
