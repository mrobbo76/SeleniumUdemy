package staticpackage;

public class StaticDemo {

	// objects created for class
	public static void main(String[] args) {
		StaticExampleClass s1 = new StaticExampleClass("bmw");
		System.out.println("Make of Car is: " + s1.getMake());
		System.out.println("This is instance no: " + StaticExampleClass.getInstanceNum());

		StaticExampleClass s2 = new StaticExampleClass("benz");
		System.out.println("Make of Car is: " + s2.getMake());
		System.out.println("This is instance no: " + StaticExampleClass.getInstanceNum());
	}
}

//6-35