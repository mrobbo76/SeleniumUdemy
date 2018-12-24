package exercises;

public class ReverseString2 {

	public static void main(String[] args) {

		String myStr = "abcdefg";

		// create Method and pass and input parameter string
		String reversed = reverseString(myStr);
		System.out.println("The reversed string is: " + reversed);

	}

	// Method take string parameter and check string is empty or not
	public static String reverseString(String myStr) {
		if (myStr.isEmpty()) {
			// System.out.println("String is now empty");
			return myStr;
		}
		// Calling Function Recursively
		// System.out.println("String to be passed in Recursive Function: " +
		// myStr.substring(1));
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}

}