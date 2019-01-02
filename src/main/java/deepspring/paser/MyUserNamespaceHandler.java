package deepspring.paser;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyUserNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("staff",new StaffBeanDefinitionParser());
	}

}
