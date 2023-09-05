package strings;

public class Class1 {

	public static void main(String[] args) {
		
		int n = 2;
		
		for(int i = 1; i<=10; i++) {
			//string has the format method, that receives a string format and the necessary
			//information to match the string
			//String s = String.format("%d x %d = %d", n, i, n * i );
			//System.out.println(s);
			
			
			//this way the output already comes formatted
			System.out.format("%d x %d = %d", n, i, n * i );
			
		}

	}

}
