package deepspring.dependency;

public class TestB {
	
	private TestC testC;
	
	public TestB() {
		super();
	}
	
	public TestB(TestC testC) {
		super();
		this.testC = testC;
	}

	public void b() {
		System.out.println("b");
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}

}
