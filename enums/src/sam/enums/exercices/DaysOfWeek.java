package sam.enums.exercices;

public enum DaysOfWeek {
	SUNDAY(null),
	SATURDAY(SUNDAY),
	FRIDAY(SATURDAY),
	THURSDAY(FRIDAY),
	WEDNESDAY(THURSDAY),
	TUESDAY(WEDNESDAY), 
	MONDAY(TUESDAY);

	
	
	
	
	
	// created the enum with the respective numbers. 

	
	private final DaysOfWeek next;	// created a final and private variable 
	
	//constructor to receive the number
	DaysOfWeek(DaysOfWeek next){
		this.next = next;
	}
	

	public DaysOfWeek next() {
       return this.next == null ? MONDAY : this.next;    
       }

}

