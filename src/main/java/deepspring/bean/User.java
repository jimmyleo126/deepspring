package deepspring.bean;

public class User {
	
	public void showMe() {
		System.out.println("i am user!");
	}
	
	private Meth m = new Meth();
	
	public Meth getMeth() {
		return this.m;
	}
	
	public static void main(String[] args) {
		
	}

}
