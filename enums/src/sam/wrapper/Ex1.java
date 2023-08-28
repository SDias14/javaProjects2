package sam.wrapper;

public class Ex1 implements Operation {
	
	
	Integer n1;
	Integer n2;
	
	public Ex1(Integer n1, Integer n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	
	

	
	public Integer getN1() {
		return n1;
	}





	public Integer getN2() {
		return n2;
	}





	@Override
	public int execute(Integer n1, Integer n2) {
		
		Integer n3 = n1 + n2;

		return n3;
	}

}
