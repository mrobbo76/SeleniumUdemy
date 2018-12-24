package oopconcepts;

public class Car5 {
	private String make;
	int speed;
	int gear;

	public Car5() {
		this(10, 2); // this calls 'with arguments'; can call constructor within constructor
		this.speed = 0;
		this.gear = 0;
		System.out.println("car5 - Executing constructor without arguments");
	}

	public Car5(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("car5 - Executing constructor with arguments");
	}

	// "this" refers to the instance of the class (object)
	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}
}

//4-30