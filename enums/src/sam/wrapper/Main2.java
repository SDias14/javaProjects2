package sam.wrapper;

public class Main2 {
	
	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(1); // it makes the conversion of a primitive type into a wrapper class object
		
		Integer j = Integer.valueOf("1"); //value of is able to make a string parse. 
		
		Integer k = Integer.parseInt("22"); // it will parse the string.
		
		Boolean b = Boolean.valueOf(true); //primitive 
		
		Boolean c = Boolean.valueOf("false"); // string parse
		
		Boolean d = Boolean.parseBoolean("true"); // it will parse directly the boolean value.
		
		System.out.println(j);
		
		System.out.println(k);
		
		System.out.println("the b is " + b + " the c is " + c + " and d is : " + d);
		
	}

}
