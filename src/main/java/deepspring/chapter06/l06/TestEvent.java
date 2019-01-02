package deepspring.chapter06.l06;

import org.springframework.context.ApplicationEvent;

/**
 * ��������¼�
 * @author Administrator
 *
 */
public class TestEvent extends ApplicationEvent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String msg;

	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}
	
	public void print() {
		System.out.println(msg);
	}

}
