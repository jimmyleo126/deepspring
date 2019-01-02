package deepspring.dependency;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class TestA {
	

	private TestB testB;
	

	private TestC testC;
	
	private List<TestB> listtestB;
	
	public TestA() {
		super();
	}
	
	public TestA(String name) {
		System.out.println(name);
	}
	
	public TestA(TestB testB) {
		super();
		this.testB = testB;
	}

	public void a() {
		System.out.println("a");
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}

	public List<TestB> getListtestB() {
		return listtestB;
	}

	public void setListtestB(List<TestB> listtestB) {
		this.listtestB = listtestB;
	}

}
