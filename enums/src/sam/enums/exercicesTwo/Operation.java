package sam.enums.exercicesTwo;

public enum Operation {
	SUM("+"),
	SUBTRACT("-"),
	MULTIPLY("*"),
	DIVIDE("/");
	
	private String string;
	
	Operation(String string){
		this.string = string;
	}
	
	
	public double calculate(double num1, double num2) {
		
		return switch(this) {
		case SUM-> num1 + num2;
		case SUBTRACT -> num1 - num2;
	    case MULTIPLY-> num1 * num2 ;
	    case DIVIDE -> num1 / num2;
	    };
		
	}
	
	
	
	@Override 
    public String toString() {
		return "The operation symbol is : " + string;
	}

	

}
