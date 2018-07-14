package deepspring.bean;

public abstract class GetBeanTest {

	public void showMe() {
		this.hh().showMe();
	}

	public abstract User hh();
}
