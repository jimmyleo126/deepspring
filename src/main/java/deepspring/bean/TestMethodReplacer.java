package deepspring.bean;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class TestMethodReplacer implements MethodReplacer {

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		for (Object object : args) {
			System.out.println(object.toString());
		}
		System.out.println("我替换了原来的方法");
		return null;
	}

}
