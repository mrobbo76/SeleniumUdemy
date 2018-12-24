package automobile;

//this is a class
public class InterfaceDemoInstance {

	// it is creating a new instance of Interface (which in turn is a class that
	// implements CarsInterface)
	// it is then setting up values as defined in InterfaceDemo
	public static void main(String[] args) {
		CarsInterface myInterface = new InterfaceDemo();
		myInterface.engineStart("6 Cyl", true);
	}
}

//8-43