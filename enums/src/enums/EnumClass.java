package enums;

/*
 * the enum is static. we cannot change them, unless we recompile the code. 
 * enums cannot be extended 
 * enums extends from enum class
 */

public enum EnumClass {
	JANUARY(1),
	FEBRUARY(2),
	MARCH(3), 
	APRIL(4),
	MAY(5),
	JUNE(6),
	JULY(7),
	AUGUST(8),
	SEPTEMBER(9),
	OCTOBER(10),
	NOVEMBER(11),
	DECEMBER(12);
	
	private final int monthNum;	
	
	EnumClass(int monthNum){
		this.monthNum = monthNum;
	}
	
	public int getMonthNum() {
		return monthNum;
	}
	
	//SWITCH EXPRESSION. 
	public int numberOfDays() {
		return switch(this) {
		case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER-> 31;
		case FEBRUARY -> 28 ;
	    case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30 ;

		};
	}
	
	@Override 
    public String toString() {
		return "Month : " + name();
	}

}
