package sam.enumStatic;

import static sam.enumStatic.Car.Brand;

public class Main {

	public static void main(String[] args) {
		
		Car b1 = new Car(Brand.AUDI);
		
		System.out.println(b1.getBrand());  

	}

}
