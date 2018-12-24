package oopconcepts;

public class ConstructorDemo {

	public static void main(String[] args) {

		Car5 c1 = new Car5();

		c1.setMake("BmW");
		System.out.println(c1.getMake());

		System.out.println(c1.speed);
		System.out.println(c1.gear);

		System.out.println("*********************");

		Car5 c2 = new Car5(10, 3);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}
}

//4-30