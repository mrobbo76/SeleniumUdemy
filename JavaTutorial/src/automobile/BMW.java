package automobile;

public class BMW extends Cars { // Cars = super class

	public BMW(int startSpeed) {
		super(startSpeed); // super = will access super class (Cars)
	}

	@Override
	public void increaseSpeed() {
		protectedSpeed++;
		Cars c1 = new Cars();
		c1.decreaseSpeed();
		System.out.println("Increasing Speed of BMW"); // overridden increaseSpeed (from Cars class) with it's own BMW
														// specific method
	}

	public void headupDisplayNavigation() {
		System.out.println("BMW Specific Functionality");
	}

	public void stop() {
		Cars c1 = new Cars();
		c1.decreaseSpeed();
	}
}

//8-40
//8-41