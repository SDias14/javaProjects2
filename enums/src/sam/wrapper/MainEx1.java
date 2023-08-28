package sam.wrapper;

public class MainEx1 {

	public static void main(String[] args) {
		
		Ex1 n = new Ex1(10, 20);
		
		Integer n1 = n.getN1();
		
		Integer n2 = n.getN2();
		
		
		int finalNumber = n.execute(n1, n2);

		
		System.out.println(finalNumber);
		

	}

}
