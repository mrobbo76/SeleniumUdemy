package automobile;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.increaseSpeed();
		c1.speed = 10;
		c1.setPrivateSpeed(10);
		c1.publicSpeed = 100;
		c1.protectedSpeed = 100;
		c1.decreaseSpeed();
	}
}

//no modifier - only accessible within same package (typically variables within methods)
//private - only used in class (although can use getters/setters to be able to use outside of class)
//public - accessible anywhere in project (via importing)
//protected - 1) available by any class within package, and 2) available by other sub-classes outside of the package
//8-41