package sam.enums.exercicesTwo;

public class Main {

	public static void main(String[] args) {
		
		Operation o1 = Operation.SUBTRACT;
		Operation o2 = Operation.SUM;
		Operation o3 = Operation.MULTIPLY;
		Operation o4 = Operation.DIVIDE;
		
		System.out.println(o1); //subtract
		System.out.println(o2); // sum 
		System.out.println(o3); // multiply 
		System.out.println(o4); // divide
		
		System.out.println("////////////////////////////");
		System.out.println("\n");
		
		System.out.println(o1.calculate(10, 5));
		System.out.println(o2.calculate(10, 10));
		System.out.println(o3.calculate(8, 5));
		System.out.println(o4.calculate(50, 10));

	}

}
