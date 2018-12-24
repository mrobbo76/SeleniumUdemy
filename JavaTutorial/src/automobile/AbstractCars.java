package automobile;

//abstract keyword defines class as abstract
public abstract class AbstractCars {

	private int privateSpeed;
	public int publicSpeed;

	protected int protectedSpeed;

	int speedLimit = 100;

	// constructor AbstractCars - name has to match name of class
	public AbstractCars() {
		this(0);
	}

	public AbstractCars(int startSpeed) {
		this.privateSpeed = startSpeed;
	}

	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}

	// this abstract method has no 'body', it only sets up name/inputs (string and
	// int)
	// this is then used in AbstractDemoBMW, where it is used and customised with
	// sysos
	public abstract void engineStart(String keyType, int numOfCyl);
}

//Abstraction used to hide inner workings of a class from other classes, where only functionality of a method can be seen
//2 ways to abstract - 1) abstract class, 2) interfaces
//Cannot create objects in abstract class
//abstract class cannot be instantiated by another class

//8-42