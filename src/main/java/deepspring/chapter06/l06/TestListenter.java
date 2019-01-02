package deepspring.chapter06.l06;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class TestListenter implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof TestEvent) {
			TestEvent testEvent = (TestEvent) event;
			testEvent.print();
		}
		
	}

}
