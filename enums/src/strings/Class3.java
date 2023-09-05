package strings;

import java.text.NumberFormat;
import java.util.Locale;

public class Class3 {
	
	public static void main(String[] args) {
		
		double n = 3456.21;
		
		Locale local = new Locale("pt", "BR");
		
		NumberFormat nf = NumberFormat.getInstance(local); // object nf of the NumberFormat class 
		
		String formatted = nf.format(n);
		
		System.out.println(formatted);
	}
	


}
