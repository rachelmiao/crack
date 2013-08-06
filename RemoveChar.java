
/**
 * Write a method to check if a string is a palindrome
 */
public class Test {
	public static void main(String[] args) {
		String testString = "Well, I don't like the letter e";
		System.out.println(removeChar(testString, 'e'));
	}

	static String removeChar(String s, char c) {
		StringBuffer strbuf = new StringBuffer();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != c) {
				strbuf.append(arr[i]);
			}
		}
		return strbuf.toString();
	}
}
