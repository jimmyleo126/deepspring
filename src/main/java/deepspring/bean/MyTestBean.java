package deepspring.bean;

public class MyTestBean {
	
	private String testStr = "testStr";
	
	public void init() {
		System.out.println("this is init....");
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	

}
