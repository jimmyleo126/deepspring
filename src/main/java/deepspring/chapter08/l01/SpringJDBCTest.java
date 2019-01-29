package deepspring.chapter08.l01;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

public class SpringJDBCTest {

	public static void main(String[] args) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/lj");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
//		MysqlConnectionPoolDataSource  mysqlConnectionPoolDataSource = new MysqlConnectionPoolDataSource();
//		mysqlConnectionPoolDataSource.setUrl("jdbc:mysql://localhost:3306/lj");
//		mysqlConnectionPoolDataSource.setUser("root");
//		mysqlConnectionPoolDataSource.setPassword("root");
		
		UserServiceImpl usi = new UserServiceImpl();
		usi.setDataSource(dataSource);
//		User user = new User();
//		user.setName("eriji");
//		user.setAge(50);
//		user.setSex("ÄÐ");
//		usi.save(user);
		List<User>  df = usi.getUsers();
		System.out.println(df);

	}

}
