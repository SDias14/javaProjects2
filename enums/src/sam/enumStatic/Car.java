package sam.enumStatic;

public class Car {
	
	public enum Brand{
		BMW, AUDI, VW
	}
	
	private final Brand brand; // i've created an enum inside a class. it's common to create enum inside classes.
	
	public Car(Brand brand) {
		this.brand = brand;
	}
	
	public Brand getBrand() {
		return brand;
	}

}
