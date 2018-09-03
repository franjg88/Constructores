
public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal = new Animal("Podenco");
		Animal animal2 = new Animal("Carlino",5);
		animal.setRaza("Pastor");
		
		System.out.println(animal.getRaza());
		System.out.println(animal1.getRaza());

		System.out.println(animal2.getRaza());

	}

}
