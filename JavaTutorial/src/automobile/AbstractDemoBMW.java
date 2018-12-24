package automobile;

//have to extend class to use abstract class
public class AbstractDemoBMW extends AbstractCars {

	// can use setPrivateSpeed from abstract class
	public void setPrivateSpeed(int speed) {
		// super. = calling super (or parent) class, which is AbstractCars, calling
		// method, passing in 10, therefore setting privatSpeed = 10
		super.setPrivateSpeed(10);
	}

	// this uses engineStart method from abstract class, then implements this in a
	// different way within this class (different outputs)
	// this is the point of abstraction - you use methods from abstract class, and
	// adapt (override) these in a way that is required for this class
	@Override
	public void engineStart(String keyType, int numOfCyl) {
		System.out.println("This is the BMW engine start");
		System.out.println("Every child class may have different implementation");
	}
}

//extended classes such as this one have to use methods set up in abstract class (in other case, engineStart), even if not used

//8-42