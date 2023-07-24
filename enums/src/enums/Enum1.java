package enums;

/* enumerations = it is a type of data with pre-determined value.	
 * Enums follow the same convention as classes. Capital letters. 
 * for the name of enums we treat them as constants, so we write with capital letters. 
 * month.ordinal = it will return the position. it starts from zero. 
 */

public class Enum1 {

	
	public static void main(String[] args) {
		
		EnumClass firstMonth  = EnumClass.JANUARY; //the variable is a enum type, which receives a value of the specific enum, being accessed as a property of a object.
		
		System.out.println(firstMonth.ordinal()); //ordinal
		System.out.println(firstMonth); // toString method.
		System.out.println(firstMonth.getMonthNum());// the number of the month
		
		EnumClass secondMonth = EnumClass.valueOf("FEBRUARY"); //static method. 
		
		System.out.println(secondMonth.getMonthNum()); // it will return the number of that month. 
		
		EnumClass thirdMonth = Enum.valueOf(EnumClass.class, "MARCH"); // i am creating a enum of type EnumClass with the value march
		
		System.out.println(thirdMonth);
		
		
		System.out.println(EnumClass.FEBRUARY.numberOfDays()); // FIRST THE CLASS, AFTER THE VALUE AND LAST THE METHOD.
	}

}
