
/**
 * Write a method to check if a string is a palindrome
 */
public class Test {
	public static void main(String[] args) {
		String testString = "hellolleh";
		System.out.println(isPalindrome(testString));
	}

	static boolean isPalindrome(String s) {
		// Compute its reverse
		String rev = reverse(s);
		return (rev.equals(s));
	}

	static String reverse(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return String.copyValueOf(arr);
	}
}
