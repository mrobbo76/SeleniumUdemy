package oopconcepts;

public class ClassDemo2 {

	public static void main(String[] args) {
		Car3 bmw = new Car3(); // Create and initialize the object
		bmw.setMake("BMW");
		System.out.println(bmw.getMake());

		Car3 benz = new Car3();
		benz.setMake("Benz");
		System.out.println(benz.getMake());

		benz.setModel("c300");
		System.out.println(benz.getModel());

		benz.setYear(2020);
		System.out.println(benz.getYear());
	}
}

//4-28