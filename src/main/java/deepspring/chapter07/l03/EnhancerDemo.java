package deepspring.chapter07.l03;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class EnhancerDemo {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(EnhancerDemo.class);
		enhancer.setCallback(new MethodInterceptorImpl());
		
		EnhancerDemo demo = (EnhancerDemo) enhancer.create();
		demo.test();
		System.out.println(demo);

	}
	
	public void test() {
		System.out.println("EnhancerDemo test(dfdf)");
	}
	
	private static class MethodInterceptorImpl implements MethodInterceptor{

		@Override
		public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
			System.out.println("Before invoke " + arg1);
			Object result = arg3.invokeSuper(arg0, arg2);
			System.out.println("After invoke " + arg1);
			return result;
		}
		
	}

}
