package strings;

public class Account2 {
	private final String number;
	private final String name;
	private final double balance;
	
	
	public Account2(String number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}


	public String getNumber() {
		return number;
	}


	public String getName() {
		return name;
	}

	
	public double getBalance() {
		return balance;
	}


	@Override
	public String toString() {
		
		return String.format("%5s - %-15s : %.2f\t", number, name, balance);
	}
	
	
	//%s = format to string
	//%d = decimal numbers
	//%f = float numbers
	//11 = the qualifier in order to format the character size in the line.
	//%.2 tells the number of decimal houses.
	

}
