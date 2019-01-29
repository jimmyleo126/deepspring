package deepspring.chapter07.l01;

public class TestBean implements IBean{
	
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	public void test() {
		System.out.println("test");
	}

}
