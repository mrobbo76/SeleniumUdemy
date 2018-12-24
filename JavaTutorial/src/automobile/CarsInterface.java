package automobile;

//interface - reference type, similar to class, collection of abstract methods, signatures of methods, does not have implementation, any class can implement interface, and will have all method definitions
//interface is keyword to denote interface
public interface CarsInterface {

	// interfaces can also contain variables
	public String speed = "100";

	// abstract method, no implementation, just sets it up
	public void engineStart(String engineType, boolean isKeyLess);

}

//8-43