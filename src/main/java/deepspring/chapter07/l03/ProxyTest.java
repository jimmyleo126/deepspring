package deepspring.chapter07.l03;

public class ProxyTest {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
		UserService proxy = (UserService) invocationHandler.getProxy();
		
		proxy.add();
	}

}
