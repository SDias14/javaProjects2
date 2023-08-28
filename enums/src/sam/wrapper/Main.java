package sam.wrapper;

public class Main {

	public static void main(String[] args) {
		
		int i = 10;//primitive type int.
		
		//wrapping the variable int i into an integer object 
		
		Integer x = Integer.valueOf(i); //wrapper class.After the declaration, we can not change the value. 
		
		//extract the value 
		
		int j = x.intValue(); // it returns the value inside the wrapper object. 
		
		Double d1 = Double.valueOf(10.5);
		
	   
		
		System.out.println(x);
		
		System.out.println(j);
		
		System.out.println(d1);
	}

}
