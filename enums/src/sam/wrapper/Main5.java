package sam.wrapper;

public class Main5 {

	public static void main(String[] args) {
		
		@SuppressWarnings("removal")
		Integer i1 = new Integer(10);
		
		@SuppressWarnings({"removal" })
		Integer i2 = new Integer(10);
		
		Integer i3 = 10; // auto - boxing
		
		Integer i4 = 10; 
		
		Integer i5 = 1000;
		
		Integer i6 = 1000;
		
		System.out.println(i1 == i2); // false, because the references are distinct. 
		
		System.out.println(i1.equals(i2)); // true, values are equal.
		
		System.out.println(i3 == i4); // the same reference. pool 
		
		System.out.println(i5 == i6); // false. the cache is not generic. it has its limitations
		
		System.out.println(i5.equals(i6)); // the best way to compare wrapper objects.
		

	}

}
