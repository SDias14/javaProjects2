package sam.wrapper;

public class Main3 {

	public static void main(String[] args) {
		
		String b = Integer.toBinaryString(15); // it will return a binary string
		
		System.out.println(b);
		
		String c = Integer.toHexString(15);
		
		System.out.println(c); // it will show an hexadecimal number
		
		Integer d = Integer.valueOf("11010", 2);
		
		System.out.println(d);
		
		Integer e = Integer.decode("1110");
		
		System.out.println(e);

	}

}
