package staticpackage;

public class StaticKeynotesDemo {

	// Static method cannot use the non-static variable or method directly
	// This (this.) and super cannot be used in static context

	public int addNum = 10;
	public static int addNumStatic = 11;

	public static void main(String[] args) {
		StaticKeynotesDemo s1 = new StaticKeynotesDemo();
		int output = s1.sum(12);
		int staticOutput = sumStatic(13);
		System.out.println("The output is: " + output);
		System.out.println("The output is: " + staticOutput);
	}

	// note - this is not static (and neither is addnum declaration), therefore fine
	// (otherwise - error)
	public int sum(int num) {
		return num + addNum;
	}

	// note - this is static (but so is is addnumStatic declaration), therefore fine
	// (otherwise - error)
	public static int sumStatic(int num) {
		return num + addNumStatic;
	}
}

//6-36