package automobile;

public class Cars {
	// No Modifier - accessible in the same package, e.g. can be used in
	// AccessModifiersDemo
	int speed;
	// Only in class, e.g. can be used within class, but not in AccessModifiersDemo
	@SuppressWarnings("unused")
	private int privateSpeed;

	// Anywhere in Java World with importing the package and class, e.g. pretty much
	// available anywhere (other packages/classes)
	public int publicSpeed;

	// In same package and in sub classes - 1) available by any class within
	// package, and 2) available by other sub-classes outside of the package
	protected int protectedSpeed;

	int speedLimit = 100;

	public Cars() {
		this(0);
	}

	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}

	public Cars(int startSpeed) {
		this.privateSpeed = startSpeed;
	}

	public void increaseSpeed() {
		if (speed < 100) {
			speed++;
		}
		System.out.println("Increasing Speed of Cars ");
	}

	protected void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of Cars");
	}
}

//8-40
//8-41