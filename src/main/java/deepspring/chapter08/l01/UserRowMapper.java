package deepspring.chapter08.l01;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet set, int index) throws SQLException {
		User person = new User();
		person.setId(set.getInt("id"));
		person.setName(set.getString("name"));
		person.setAge(set.getInt("age"));
		person.setSex(set.getString("sex"));
		return person;
	}
	
}
