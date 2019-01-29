package deepspring.chapter09.l02;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("chapter09/l02/beanFactoryTest.xml");
		UserMapper userDao = (UserMapper) context.getBean("userMapper");
		User user = userDao.getUser(9);
		User uu = new User();
		BeanUtils.copyProperties(user, uu);
		System.out.println(userDao.getUser(9).getName());
		
	}

}
