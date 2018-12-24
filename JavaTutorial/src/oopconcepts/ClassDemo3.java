package oopconcepts;

public class ClassDemo3 {

	public static void main(String[] args) {
		Car4 bmw = new Car4(); // Create and initialize the object
		bmw.setMake("BMW");
		System.out.println("Make of BMW is: " + bmw.getMake());

		System.out.println("Model of BMW is: " + bmw.getModel());

		Car4 benz = new Car4();
		benz.setMake("Benz");
		System.out.println("Make of Benz is: " + benz.getMake());

		benz.setModel("c300");
		System.out.println("Model of Benz is: " + benz.getModel());

		benz.setYear(1800);
		System.out.println("Year of Benz is: " + benz.getYear());
	}
}

//4-29