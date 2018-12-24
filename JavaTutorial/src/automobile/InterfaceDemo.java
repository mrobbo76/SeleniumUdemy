package automobile;

//this implements TWO interfaces 
//classes that implement interfaces MUST use methods of abstract class, otherwise get error
public class InterfaceDemo implements CarsInterface, BMWCarsInterface {

	@Override
	// implementation of CarsInterface
	public void engineStart(String engineType, boolean isKeyLess) {
		System.out.println("This is the implementation");
		// engineType defined in main method in InterfaceDemoInstance
		System.out.println("Cyclinder info : " + engineType);
	}

	@Override
	// implementation of BMWCarsInterface
	public void headsUpNavigation() {
		System.out.println("This is the headsup navigation");
	}
}

//8-43