package deepspring.chapter06.l04;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	
	private Hello hello;
	
	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}

	public void saySomething() {
		hello.say();
	}
	
	public void Test() {
		System.out.println("nihao");
	}

}
