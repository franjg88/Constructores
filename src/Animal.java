
public class Animal {
	
	private String raza;
	private Integer numeroPatas;
	
	public  Animal(String animal) {
		
		this.raza = animal;
	}
	
	
	public Animal(String raza, Integer numeroPatas) {
		super();
		this.raza = raza;
		this.numeroPatas = numeroPatas;
	}


	public Animal() {
		super();
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}
