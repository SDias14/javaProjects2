package enumInterface;

public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		talk(d);
		
		talk(MyPet.CAT); // toString.
		talk(MyPet.MOUSE);
		

	}
	
	private static void talk(Pet pet) {
		System.out.println(pet.talk());
	}

}
