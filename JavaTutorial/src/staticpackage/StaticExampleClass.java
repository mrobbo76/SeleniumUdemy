package staticpackage;

public class StaticExampleClass {
	// this is static, remains 4 regardless of vehicle, not incremented in
	// constructor, remains 4
	// static = only one copy (in this case 4) stored to memory
	private static int wheelsCount = 4;
	private String make;
	// static defines int as a static variable, meaning it will correctly increment
	// on each instanceNum++ (otherwise it resets every time an object is
	// created/ran)
	private static int instanceNum = 0;

	// constructor
	public StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;
	}

	public String getMake() {
		return make;
	}

	// declare method as static (to match corresponding variable declaration above)
	public static int getInstanceNum() {
		return instanceNum;
	}

}

//6-35