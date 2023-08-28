package sam.wrapper;

import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um numero : ");
		
		Integer n1 = leitor.nextInt();
		
		
		String d1 = Integer.toBinaryString(n1);
		
		String d2 = Integer.toHexString(n1);
		
		String d3 = Integer.toOctalString(n1);
		
		
		System.out.println(d1);
		
		System.out.println("////////////");
		
		System.out.println(d2);
		
		System.out.println("////////////");
		
		System.out.println(d3);
		
		
		
		
		
	}

}
