package deepspring.bean;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class TestMethodReplacer implements MethodReplacer{
	
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("changeMe aaa" + args[0]);
		return null;
	}

}
