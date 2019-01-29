package deepspring.chapter09.l01;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TestMapper {
	
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public static void main(String[] args) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//			User user = new User();
//			user.setName("tom");
//			user.setAge(50);
//			user.setSex("ÄÐ");
//			userMapper.insertUser(user);
//			sqlSession.commit();
			User user = userMapper.getUser(9);
			System.out.println(user);
		}finally {
			sqlSession.close();
		}
		
	}

}
