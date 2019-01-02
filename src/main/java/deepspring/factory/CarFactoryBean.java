package deepspring.factory;

import org.springframework.beans.factory.FactoryBean;

import deepspring.bean.Car;

public class CarFactoryBean implements FactoryBean<Car> {
	
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Car getObject() throws Exception {
		return new Car(brand, 50000);
	}

	public Class<?> getObjectType() {
		return Car.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
