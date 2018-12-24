package introduction;

import automobile.Cars;

//Honda class (in one package) is a subclass of Cars class (in another class). Subclass denoted by 'extends'. This means that subclasses can use protected variables
public class Honda extends Cars {
	public void increaseHondaSpeed() {
		Cars c1 = new Cars();
		// publicSpeed available as it is public
		c1.publicSpeed = 10;
		// setPrivateSpeed is available. PrivateSpeed (in Cars) is set to Private so
		// otherwise would not have been selectable, but getter/setter has meant this
		// can be used in another package
		c1.setPrivateSpeed(10);
		// protectedSpeed can be used as this class is a subclass to the class (Cars)
		// where protectedSpeed is defined
		protectedSpeed = 100;

	}

}
