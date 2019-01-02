package deepspring.dependency;

public class TestC {
	
	private TestA testA;
	
	public TestC() {
		super();
	}
	
	public TestC(TestA testA) {
		super();
		this.testA = testA;
	}

	public void c() {
		System.out.println("c");
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}

}
