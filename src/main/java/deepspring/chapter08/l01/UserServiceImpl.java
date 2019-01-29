package deepspring.chapter08.l01;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserServiceImpl {
	
	private JdbcTemplate jdbcTemplate;
	
	//设置数据源
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void save(User user) {
		String sql = "INSERT INTO USER (NAME,age,sex) VALUES(?,?,?)";
		jdbcTemplate.update(sql, new Object[] {user.getName(), user.getAge(), user.getSex()}, 
				new int[] {java.sql.Types.VARCHAR, java.sql.Types.INTEGER, java.sql.Types.VARCHAR});
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUsers(){
		//List<User> list = jdbcTemplate.query("select * from user", new UserRowMapper());
		System.out.println(jdbcTemplate.queryForObject("select * from user where id = 7", User.class));
		List<User> list = jdbcTemplate.queryForObject("select * from user where id = 7", new UserRowMapper());
		
		return list;
	}

}
