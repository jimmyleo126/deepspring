package deepspring.bean;

public class Car {
	
	private String brand;
	private int price;
	
	public Car() {
		super();
	}
	
	
	public Car(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
