package enumInterface;
/*
 * i can override each element of the enum to implement interfaces. 
 */

public enum MyPet implements Pet{
	CAT{
		@Override
		public String talk() {
			
			return "Miau";
		}
		
		
	},
	MOUSE{
		@Override
		public String talk() {
			
			return "friu";
		}
		
	};


	

}
